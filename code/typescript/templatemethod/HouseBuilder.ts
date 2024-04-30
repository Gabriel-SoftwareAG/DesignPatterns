namespace TemplateMethod {
    abstract class HouseBuilder {
        // The template method defining the sequence of steps to build a house.
        public buildHouse(): void {
            this.layFoundation();
            this.buildWalls();
            this.installRoof();
            this.doInterior();
        }

        // Common step implemented in the abstract class itself.
        private layFoundation(): void {
            console.log("Laying the foundation with concrete and steel bars.");
        }

        // Steps that need to be implemented by subclasses.
        protected abstract buildWalls(): void;

        protected abstract installRoof(): void;

        protected abstract doInterior(): void;
    }
}
