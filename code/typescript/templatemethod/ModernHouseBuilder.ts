namespace TemplateMethod {
    class ModernHouseBuilder extends HouseBuilder {
        protected buildWalls(): void {
            console.log("Building walls with glass and steel.");
        }

        protected installRoof(): void {
            console.log("Installing a flat, green roof.");
        }

        protected doInterior(): void {
            console.log("Doing interior with an open concept design and minimalist furniture.");
        }
    }
}
