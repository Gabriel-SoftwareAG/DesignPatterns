import { Interpreter } from "./Interpreter";
import { Context } from "./Context";

let context = new Context("English");
let interpreter = new Interpreter();

let expression = "Hello";
console.log(`Client: Sending expression - ${expression}`);
interpreter.interpret(expression, context);

let complexExpression = "How are you?";
console.log(`Client: Sending expression - ${complexExpression}`);
interpreter.interpret(complexExpression, context);
