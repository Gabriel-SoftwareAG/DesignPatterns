namespace Iterator;

interface IBlog
{
    IIterator CreateIterator();
    void AddPost(Post post);
}
