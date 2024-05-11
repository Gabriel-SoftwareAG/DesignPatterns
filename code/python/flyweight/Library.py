from ConcreteBook import ConcreteBook


class Library:
    def __init__(self):
        self.books = {}

    def get_book(self, title, author):
        if title not in self.books:
            new_id = len(self.books) + 1
            self.books[title] = ConcreteBook(title, author, new_id)
        return self.books[title]

    def borrow_book(self, title, author):
        book = self.get_book(title, author)
        if book.is_available():
            book.borrow_book()
        else:
            print(f"Book is currently not available: {title}. Ordering a new copy.")
            new_id = len(self.books) + 1
            new_book = ConcreteBook(title, author, new_id)
            self.books[title + " #" + str(new_id)] = new_book
            new_book.borrow_book()

    def return_book(self, title):
        if title in self.books:
            self.books[title].return_book()
