package templatemethod;

class Client {

    public static void main(String[] args) {
        HouseBuilder modernBuilder = new ModernHouseBuilder();
        modernBuilder.buildHouse(); // Builds a modern house

        System.out.println("----------");

        HouseBuilder traditionalBuilder = new TraditionalHouseBuilder();
        traditionalBuilder.buildHouse(); // Builds a traditional house
    }
}
