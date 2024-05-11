from Painting import Painting
from Sculpture import Sculpture
from Patron import Patron

if __name__ == "__main__":
    painting = Painting()
    sculpture = Sculpture()

    patron = Patron()

    painting.accept(patron)
    sculpture.accept(patron)
