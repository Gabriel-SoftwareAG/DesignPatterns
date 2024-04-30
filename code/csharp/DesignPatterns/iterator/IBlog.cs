namespace Iterator
{
    public interface IBlog
    {
        IIterator CreateIterator();
        void AddPost(Post post);
    }
}
