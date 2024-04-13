package interpreter;

class Client {
    public static void main(String[] args) {
        Context context = new Context("English"); // Create a context/environment
        Interpreter interpreter = new Interpreter(); // Create an interpreter

        String expression = "Hello"; // Expression to interpret
        System.out.println("Client: Sending expression - " + expression);
        interpreter.interpret(expression, context); // Interpret the expression
    }
}
