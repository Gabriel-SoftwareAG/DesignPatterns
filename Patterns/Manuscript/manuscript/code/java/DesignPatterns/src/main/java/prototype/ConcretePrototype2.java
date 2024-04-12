package prototype;

public class ConcretePrototype2 extends Prototype {

    @Override
    public Prototype clone() {
        return new ConcretePrototype2();
    }
}