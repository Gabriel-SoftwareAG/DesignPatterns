package prototype;

public class Client {
    public static void main(String[] args) {
        // Create concrete prototype instances
        Prototype teddyBear1 = new WhiteTeddyBearPrototype();
        Prototype teddyBear2 = new BlackTeddyBearPrototype();

        // Clone teddy bears
        Prototype clonedTeddyBear1 = teddyBear1.clone();
        Prototype clonedTeddyBear2 = teddyBear2.clone();

        // Display the cloned teddy bears
        System.out.println("Cloned Teddy Bear 1: " + clonedTeddyBear1.getClass().getSimpleName());
        System.out.println("Cloned Teddy Bear 2: " + clonedTeddyBear2.getClass().getSimpleName());
    }
}
