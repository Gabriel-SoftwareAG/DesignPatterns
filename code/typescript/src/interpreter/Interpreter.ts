import { Expression } from "./Expression";
import { TerminalExpression } from "./TerminalExpression";
import { Context } from "./Context";

export class Interpreter {
    private expressions: Record<string, Expression> = {};

    constructor() {
        this.expressions["Hello"] = new TerminalExpression("Bonjour");
        // Add more expressions as needed
    }

    interpret(expression: string, context: Context): void {
        if (this.expressions[expression]) {
            let translation = this.expressions[expression].interpret(context);
            console.log(`Interpreter: Translated expression - ${translation}`);
        } else {
            console.log("Interpreter: Expression not recognized");
        }
    }
}
