from Library import Library

def main():
    library = Library.get_instance()
    library.borrow_a_book()

if __name__ == "__main__":
    main()
