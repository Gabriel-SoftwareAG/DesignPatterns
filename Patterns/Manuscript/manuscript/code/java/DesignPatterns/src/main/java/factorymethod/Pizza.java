package factorymethod;

class Pizza extends Product {
    @Override
    Product serve() {
        System.out.println("Pizza served");
        return this;
    }
}
