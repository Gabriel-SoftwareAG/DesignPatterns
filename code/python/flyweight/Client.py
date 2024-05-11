from Library import Library

if __name__ == "__main__":
    library = Library()

    library.borrow_book("Harry Potter", "J.K. Rowling")
    library.borrow_book("Harry Potter", "J.K. Rowling")
    library.return_book("Harry Potter")
    library.borrow_book("Harry Potter", "J.K. Rowling")
