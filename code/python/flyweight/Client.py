
from Library import Library

def main():
    library = Library()

    library.borrow_book("Harry Potter", "J.K. Rowling")
    library.borrow_book("Harry Potter", "J.K. Rowling")
    library.return_book("Harry Potter")
    library.borrow_book("Harry Potter", "J.K. Rowling")

if __name__ == "__main__":
    main()
