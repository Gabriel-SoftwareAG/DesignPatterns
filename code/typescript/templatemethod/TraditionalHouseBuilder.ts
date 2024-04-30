namespace TemplateMethod {
    class TraditionalHouseBuilder extends HouseBuilder {
        protected buildWalls(): void {
            console.log("Building walls with bricks and mortar.");
        }

        protected installRoof(): void {
            console.log("Installing a pitched roof with clay tiles.");
        }

        protected doInterior(): void {
            console.log("Doing interior with a classic design and wood furniture.");
        }
    }
}
