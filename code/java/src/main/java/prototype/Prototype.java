package prototype;

abstract class Prototype implements Cloneable {
    @Override
    abstract public Prototype clone();
}