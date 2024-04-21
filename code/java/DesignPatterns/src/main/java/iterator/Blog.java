package iterator;

interface Blog {
    Iterator createIterator();

    void addPost(Post post);
}
