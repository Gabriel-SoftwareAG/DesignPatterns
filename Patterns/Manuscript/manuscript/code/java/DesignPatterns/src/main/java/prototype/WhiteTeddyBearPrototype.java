package prototype;

public class ConcretePrototype1 extends Prototype {

    @Override
    public Prototype clone() {
        return new ConcretePrototype1();
    }
}