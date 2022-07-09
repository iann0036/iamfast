
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
            if (resourceParts[2] === "states" && resourceParts[5] === "aws-sdk") { //sdk integration
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
            }
            console.warn(`unknown task resource ${resource}`)
            break;
          }
      }
    }
}