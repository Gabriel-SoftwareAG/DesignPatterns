import { Library } from "./Library";

export function main(): void {
    const library = Library.getInstance();

    // Use the library instance
    library.borrowABook();
}

// Invoke main function
main();
