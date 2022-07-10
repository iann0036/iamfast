import JSONParser from './JSONParser.js';
import JSONListener from './JSONListener.js';

const optimizedIntegrationServiceToServiceName = { "states": "stepfunctions" };
const optimizedIntegrationOperationToOperationName = {};

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
        if (ctx.children[0].children[0] instanceof JSONParser.ObjContext) { // {}
            for (let child of ctx.children[0].children[0].children) {
                if (child instanceof JSONParser.PairContext) {
                    let lhs = child.children[0].getText().replace(/^"(.*?)"$/g, '$1');
                    let rhs = child.children[2];

                    // TODO...
                }
            }
        }
    }
}