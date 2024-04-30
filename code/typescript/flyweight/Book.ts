export interface Book {
    borrowBook(): void;
    returnBook(): void;
    isAvailable(): boolean;
    getId(): number;
}
