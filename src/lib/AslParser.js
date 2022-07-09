

const optimizedIntegrationServiceToServiceName = {"states":"stepfunctions"}
const optimizedIntegrationOperationToOperationName = {}
export default class AslParser {
  constructor(chars) {
    const str = chars.toString();
    this.asl = JSON.parse(str);
  }

  listClientCalls() {
    const arr = [];

    this.appendClientCalls(this.asl, arr);

    return arr;
  }

  appendClientCalls(stateMachine, arr) {
    if (!stateMachine || !stateMachine.States) return;
    for(const [name, state] of Object.entries(stateMachine.States)) {
      if (!state.Type) continue;
      switch(state.Type) {
        case "Map":
          appendServiceCalls(state.Iterator);
          break;

        case "Parallel":
          const branches = state.Branches;
          if (!branches || !Array.isArray(branches)) continue;
          for(const branch of branches) {
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
              const serviceName  = resourceParts[6];
              const method  = resourceParts[7];
              arr.push({
                client: {
                  type: serviceName,
                  variable: name
                },
                method,
                start: 0,
                stop: 0,
                args,
              })
            
              continue;
            } else if (resourceParts[2] === "states") { //optimized integration, example: arn:aws:states:::states:startExecution.sync
              const integrationService = resourceParts[5];
              const integrationOperation = resourceParts[6];
              if (!integrationService || !integrationOperation) continue;
              const serviceName  = optimizedIntegrationServiceToServiceName[integrationService] ?? integrationService;
              const method  = optimizedIntegrationOperationToOperationName[integrationOperation] ?? optimizedIntegrationOperationToOperationName[integrationOperation.split(".")[0]] ?? integrationOperation.split(".")[0];

              arr.push({
                client: {
                  type: serviceName,
                  variable: name
                },
                method,
                start: 0,
                stop: 0,
                args,
              })
            
              
              switch(resource) {
                case "arn:aws:states:::states:startExecution.sync":

                for(const eventBridgeMethod of ["PutRule", "PutTargets", "DescribeRule"]) {
                  arr.push({
                    client: {
                      type: "EventBridge",
                      variable: name
                    },
                    method: eventBridgeMethod,
                    start: 0,
                    stop: 0,
                    args: {"Name": "StepFunctionsGetEventsForStepFunctionsExecutionRule", "Rule": "StepFunctionsGetEventsForStepFunctionsExecutionRule"},
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
                start: 0,
                stop: 0,
                args: {FunctionName: functionName},
              });
              continue;

            }
            console.warn(`unknown task resource ${resource}`)
            break;
          
      }
    }
  }
}