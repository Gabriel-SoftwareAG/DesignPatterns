class Library:
    __instance = None

    def __init__(self):
        pass

    @staticmethod
    def get_instance():
        if Library.__instance is None:
            Library.__instance = Library()
        return Library.__instance

    def borrow_a_book(self):
        print("Borrowing a book from the library...")