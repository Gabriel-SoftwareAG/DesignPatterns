import { Context } from "./Context";

export interface Expression {
    interpret(context: Context): string;
}
