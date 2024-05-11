import { Expression } from "./Expression";
import { Context } from "./Context";

export class TerminalExpression implements Expression {
    constructor(private translation: string) {}

    interpret(context: Context): string {
        return this.translation;
    }
}
