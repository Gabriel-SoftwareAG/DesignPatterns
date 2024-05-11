from Book import Book


class ConcreteBook(Book):
    def __init__(self, title, author, book_id):
        self.title = title
        self.author = author
        self._is_available = True  # Use a private attribute to manage the state
        self.id = book_id

    def borrow_book(self):
        if self.is_available():
            self._is_available = False
            print(f"Book borrowed: {self.title} by {self.author} book id: {self.id}")
        else:
            print(f"Book is currently not available: {self.title}")

    def return_book(self):
        self._is_available = True
        print(f"Book returned: {self.title} by {self.author} book id: {self.id}")

    def is_available(self):
        return self._is_available

    def get_id(self):
        return self.id
