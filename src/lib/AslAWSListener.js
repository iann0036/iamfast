import JSONParser from './JSONParser.js';
import JSONListener from './JSONListener.js';

const optimizedIntegrationServiceToServiceName = { "states": "stepfunctions" };
const optimizedIntegrationOperationToOperationName = {};

class JSONObjectAccessor {
    #internalStructure
    #isLiteral
    #literalValue

    constructor(obj) {
        this.#internalStructure = obj;
        this.#isLiteral = false;
        this.#literalValue = null;

        if (this.#internalStructure instanceof JSONParser.ObjContext) {
            for (let child of this.#internalStructure.children) {
                if (child instanceof JSONParser.PairContext) {
                    let lhs = child.children[0].getText().replace(/^"(.*?)"$/g, '$1');
                    let rhs = child.children[2].children[0];

                    this[lhs] = function () {
                        let rhsObj = new JSONObjectAccessor(rhs);

                        if (rhsObj.#isLiteral) {
                            return rhsObj.#literalValue;
                        }

                        return rhsObj;
                    }();
                }
            }
        } else if (this.#internalStructure instanceof JSONParser.ArrContext) {
            let iterator = 0;
            this.#literalValue = [];
            this.#isLiteral = true;

            for (let child of this.#internalStructure.children) {
                if (child instanceof JSONParser.ValueContext) {
                    let rhs = child.children[0];

                    this.#literalValue[iterator] = function () {
                        let rhsObj = new JSONObjectAccessor(rhs);

                        if (rhsObj.#isLiteral) {
                            return rhsObj.#literalValue;
                        }

                        return rhsObj;
                    }();

                    iterator += 1;
                }
            }
        } else {
            let literalValue = this.#internalStructure.getText();

            if (literalValue.match(/^"(.*?)"$/g)) {
                literalValue = literalValue.replace(/^"(.*?)"$/g, '$1');
            } else if (!isNaN(literalValue)) {
                literalValue = Number(literalValue);
            } else if (literalValue == "true") {
                literalValue = true;
            } else if (literalValue == "false") {
                literalValue = false;
            } else if (literalValue == "null") {
                literalValue = null;
            }

            this.#literalValue = literalValue;
            this.#isLiteral = true;
        }
    }

    getStartPosition() {
        return this.#internalStructure.start.start;
    }

    getStopPosition() {
        return this.#internalStructure.stop.stop;
    }
}

export default class AslAWSListener extends JSONListener {

    constructor() {
        super();
        this.SDKDeclarations = [];
        this.ClientDeclarations = [];
        this.ClientCalls = [];
        this.VariableDeclarations = [];
        this.EnvironmentVariables = [];
    }

    exitJson(ctx) {
        if (ctx.children[0].children[0] instanceof JSONParser.ObjContext) { // { ... }
            let arr = [];
            let jsonObj = new JSONObjectAccessor(ctx.children[0].children[0]);

            this.appendClientCalls(jsonObj, arr);

            this.ClientCalls = arr;
        }
    }

    appendClientCalls(stateMachine, arr) {
        if (!stateMachine || !stateMachine.States) return;
        for (const [name, state] of Object.entries(stateMachine.States)) {
            if (!state.Type) continue;
            switch (state.Type) {
                case "Map":
                    this.appendClientCalls(state.Iterator);
                    break;

                case "Parallel":
                    const branches = state.Branches;
                    if (!branches || !Array.isArray(branches)) continue;
                    for (const branch of branches) {
                        this.appendClientCalls(branch);
                    }
                    break;

                case "Task":
                    const resource = state.Resource;
                    const args = state.Parameters;
                    if (!resource) continue;
                    const resourceParts = resource.split(":");
                    if (resourceParts[0] !== "arn" || resourceParts[1] !== "aws") continue; //doest seem like something we are looking for
                    if (resourceParts[2] === "states" && resourceParts[5] === "aws-sdk") { //sdk integration, example: arn:aws:states:::aws-sdk:dynamodb:getItem
                        const serviceName = resourceParts[6];
                        const method = resourceParts[7];
                        arr.push({
                            client: {
                                type: serviceName,
                                variable: name
                            },
                            method,
                            start: state.getStartPosition(),
                            stop: state.getStopPosition(),
                            args,
                        })

                        continue;
                    } else if (resourceParts[2] === "states") { //optimized integration, example: arn:aws:states:::states:startExecution.sync
                        const integrationService = resourceParts[5];
                        const integrationOperation = resourceParts[6];
                        if (!integrationService || !integrationOperation) continue;
                        const serviceName = optimizedIntegrationServiceToServiceName[integrationService] ?? integrationService;
                        const method = optimizedIntegrationOperationToOperationName[integrationOperation] ?? optimizedIntegrationOperationToOperationName[integrationOperation.split(".")[0]] ?? integrationOperation.split(".")[0];

                        arr.push({
                            client: {
                                type: serviceName,
                                variable: name
                            },
                            method,
                            start: state.getStartPosition(),
                            stop: state.getStopPosition(),
                            args,
                        })


                        switch (resource) {
                            case "arn:aws:states:::states:startExecution.sync":

                                for (const eventBridgeMethod of ["PutRule", "PutTargets", "DescribeRule"]) {
                                    arr.push({
                                        client: {
                                            type: "EventBridge",
                                            variable: name
                                        },
                                        method: eventBridgeMethod,
                                        start: 0,
                                        stop: 0,
                                        args: { "Name": "StepFunctionsGetEventsForStepFunctionsExecutionRule", "Rule": "StepFunctionsGetEventsForStepFunctionsExecutionRule" },
                                    });
                                }
                                break;
                        }
                        continue;
                    } else if (resourceParts[2] === "lambda" && resourceParts[5] === "function") { //lambda arn, arn:aws:lambda:us-east-1:123456789012:function:HelloFunction
                        const functionName = resourceParts[6];
                        if (!functionName) continue;

                        arr.push({
                            client: {
                                type: "Lambda",
                                variable: name
                            },
                            method: "Invoke",
                            start: state.getStartPosition(),
                            stop: state.getStopPosition(),
                            args: { FunctionName: functionName },
                        });
                        continue;

                    }
                    //console.warn(`unknown task resource ${resource}`)
                    break;
            }
        }
    }
}