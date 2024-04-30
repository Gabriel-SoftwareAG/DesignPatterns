namespace TemplateMethod {
    class Client {
        static TemplateMethod(): void {
            let modernBuilder: HouseBuilder = new ModernHouseBuilder();
            modernBuilder.buildHouse(); // Builds a modern house

            console.log("----------");

            let traditionalBuilder: HouseBuilder = new TraditionalHouseBuilder();
            traditionalBuilder.buildHouse(); // Builds a traditional house
        }
    }

    Program.TemplateMethod();
}
