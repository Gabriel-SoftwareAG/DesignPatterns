from Painting import Painting
from Sculpture import Sculpture
from Patron import Patron

def main():
    painting = Painting()
    sculpture = Sculpture()

    patron = Patron()

    painting.accept(patron)
    sculpture.accept(patron)

if __name__ == "__main__":
    main()
