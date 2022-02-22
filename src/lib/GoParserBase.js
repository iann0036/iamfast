import antlr4 from 'antlr4';
import GoParser from './GoParser.js';

export default class GoParserBase extends antlr4.Parser {

    constructor(input) {
        super(input);
    }

    closingBracket() {
        let la = this.getTokenStream().LA(1);

        return la == GoParser.R_PAREN || la == GoParser.R_CURLY;
    }
}
