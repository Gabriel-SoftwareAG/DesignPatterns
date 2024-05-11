import { Expression } from "./Expression";
import { Context } from "./Context";

export class NonterminalExpression implements Expression {
    constructor(private expression: string) { }

    interpret(context: Context): string {
        // Here would be logic for interpreting based on context
        return `Translation of complex expression: ${this.expression}`;
    }
}
