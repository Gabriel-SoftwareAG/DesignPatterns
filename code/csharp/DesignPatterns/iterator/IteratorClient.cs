using System;

namespace Iterator
{
    public class IteratorClient
    {
        public static void Iterator()
        {
            IBlog blog = new BlogPlatform();
            blog.AddPost(new Post("Title 1", "Author 1", "Summary 1"));
            blog.AddPost(new Post("Title 2", "Author 2", "Summary 2"));

            IIterator iterator = blog.CreateIterator();
            while (iterator.HasNext())
            {
                Post post = iterator.Next();
                Console.WriteLine($"Title: {post.Title}, Author: {post.Author}, Summary: {post.Summary}");
            }
        }
    }
}
