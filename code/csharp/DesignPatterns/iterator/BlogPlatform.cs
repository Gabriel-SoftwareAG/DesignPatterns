namespace Iterator;
using System.Collections.Generic;

class BlogPlatform : IBlog
{
    private List<Post> _posts = new List<Post>();

    public void AddPost(Post post)
    {
        _posts.Add(post);
    }

    public IIterator CreateIterator()
    {
        return new PostIterator(_posts);
    }
}
