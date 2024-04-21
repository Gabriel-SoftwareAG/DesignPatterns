package flyweight;

class ConcreteBook implements Book {
    private final String title;
    private final String author;
    private boolean isAvailable = true;
    private int id;

    public ConcreteBook(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;

    }

    @Override
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title + " by " + author + " book id: " + id);
        } else {
            System.out.println("Book is currently not available: " + title);
        }
    }

    @Override
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title + " by " + author + " book id: " + id);
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int getId() {
        return id;
    }
}