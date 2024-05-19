import { Book } from "./Book";

export class ConcreteBook implements Book {
    private available = true;

    constructor(private title: string, private author: string, private id: number) { }

    borrowBook(): void {
        if (this.available) {
            this.available = false;
            console.log(`Book borrowed: ${this.title} by ${this.author} book id: ${this.id}`);
        } else {
            console.log(`Book is currently not available: ${this.title}`);
        }
    }

    returnBook(): void {
        this.available = true;
        console.log(`Book returned: ${this.title} by ${this.author} book id: ${this.id}`);
    }

    isAvailable(): boolean {
        return this.available;
    }

    getId(): number {
        return this.id;
    }
}
