package iterator;

class Post {
    private String title;
    private String author;
    private String summary;

    public Post(String title, String author, String summary) {
        this.title = title;
        this.author = author;
        this.summary = summary;
    }

    // Getters for title, author, and summary
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSummary() {
        return summary;
    }
}
