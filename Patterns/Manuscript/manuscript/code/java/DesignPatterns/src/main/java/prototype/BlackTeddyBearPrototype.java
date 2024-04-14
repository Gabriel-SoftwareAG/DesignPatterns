package prototype;

public class BlackTeddyBearPrototype extends Prototype {

    @Override
    public Prototype clone() {
        System.out.println("Cloning Black Teddy Bear");
        return new BlackTeddyBearPrototype();
    }
}