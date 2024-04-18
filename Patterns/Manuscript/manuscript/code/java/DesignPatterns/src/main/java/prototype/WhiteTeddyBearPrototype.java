package prototype;

class WhiteTeddyBearPrototype extends Prototype {

    @Override
    public Prototype clone() {
        System.out.println("Cloning White Teddy Bear");
        return new WhiteTeddyBearPrototype();
    }
}