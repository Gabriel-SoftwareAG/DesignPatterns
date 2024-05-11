export class Library {
    private static uniqueInstance: Library;

    private constructor() { }

    static getInstance(): Library {
        if (!Library.uniqueInstance) {
            Library.uniqueInstance = new Library();
            console.log("Granting access to the central library");
        }
        return Library.uniqueInstance;
    }

    borrowABook(): void {
        console.log("Borrowing a book from the library...");
    }
}
