package interpreter;

class Client {
    public static void main(String[] args) {
        Context context = new Context("English"); // Create a context/environment
        Interpreter interpreter = new Interpreter(); // Create an interpreter

        String expression = "Hello"; // Expression to interpret
        System.out.println("Client: Sending expression - " + expression);
        interpreter.interpret(expression, context); // Interpret the expression

        String complexExpression = "How are you?"; // Complex expression
        System.out.println("Client: Sending expression - " + complexExpression);
        interpreter.interpret(complexExpression, context); // Interpret the complex expression
    }
}
