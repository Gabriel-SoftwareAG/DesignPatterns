export class Product {
    private parts: string[] = [];

    public addPart(part: string): void {
        this.parts.push(part);
    }

    public show(): void {
        console.log("Custom Sandwich Ingredients:");
        this.parts.forEach(part => {
            console.log(`- ${part}`);
        });
    }
}
