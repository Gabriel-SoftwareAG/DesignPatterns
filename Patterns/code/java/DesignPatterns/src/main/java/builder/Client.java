package builder;

class Client {
    public static void main(String[] args) {
        // Create a ConcreteBuilder instance
        Builder builder = new ConcreteBuilder();

        // Create a Director instance and pass the builder
        Director director = new Director(builder);

        // Construct the custom sandwich
        director.constructSandwich();

        // Get the final product (sandwich) from the builder
        Product sandwich = builder.getProduct();

        // Display the custom sandwich ingredients
        sandwich.show();
    }
}
