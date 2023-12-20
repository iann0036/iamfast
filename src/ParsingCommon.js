export function ScalarArraysAreEqual(array1, array2) {
    return array1.length === array2.length && array1.every(function(value, index) { return value === array2[index]});
}

/**
 * Returns an array of scope-resolved variables, with each item containing a map of variables at the time the function was called.
 * Each item represents an entrypoint / code path to it, usually split by many function calls towards a single function declaration.
 * 
 * Order of priority for scoped override resolution:
 * 1. Global vars
 * 2. Global vars that are redeclared / set after (implicitly by list order)
 * 3. Vars with increasingly matching scope (i.e. deepest to shallowest function depth), except current depth
 * 4. Arguments
 * 5. Vars with exactly matching scope (current depth)
 * 
 * At priority #4 and beyond, variants (different paths based on many function calls with different args) are generated
 *
 * @returns {Array}
 */
export function GetVariableDeclarationVariants(self) {
   let args = {};
   let argsVariants = [];

    // priority #1 to #3 (parent-defined)
    for (let i=0; i<self.currentScope.length; i++) {
        for (let variableDeclaration of self.VariableDeclarations) {
            if (ScalarArraysAreEqual(variableDeclaration.scope, self.currentScope.slice(0, i))) {
                args[variableDeclaration.variable] = variableDeclaration;
            }
        }
    }

    // priority #4 (args)
    for (let functionDeclaration of self.FunctionDeclarations) {
        if (ScalarArraysAreEqual(functionDeclaration.scope.concat([functionDeclaration.name]), self.currentScope)) { // scope check
            for (let argName of functionDeclaration.argNames) {
                for (let functionCall of self.FunctionCalls) {
                    if (functionCall.name == functionDeclaration.name) { // TODO: Scope check also
                        let argsVariant = Object.assign({}, args); // shallow copy

                        let resolvedCallArgs = self.resolveNamedArgs(functionCall.argsRaw);
                        
                        for (let arg of resolvedCallArgs) {
                            if (arg.index === argName.index) {
                                argsVariant[argName.argName] = {
                                    scope: [...self.currentScope],
                                    variable: argName.argName,
                                    type: arg.type,
                                    value: arg.arg
                                };
                            }
                        }

                        argsVariants.push(argsVariant);
                    }
                }
            }
        }
    }

    if (argsVariants.length == 0) {
        argsVariants = [args];
    }

    // priority #5 (within function)
    for (let variableDeclaration of self.VariableDeclarations) {
        if (ScalarArraysAreEqual(variableDeclaration.scope, self.currentScope)) {
            args[variableDeclaration.variable] = variableDeclaration;

            for (let i=0; i<argsVariants.length; i++) {
                argsVariants[i][variableDeclaration.variable] = variableDeclaration;
            }
        }
    }

    // TODO: dedup variants
    // TODO: redeclarations

    return argsVariants;
}