namespace Iterator;
using System;
using System.Collections.Generic;

class PostIterator : IIterator
{
    private List<Post> _posts;
    private int _position = 0;

    public PostIterator(List<Post> posts)
    {
        _posts = posts;
    }

    public bool HasNext()
    {
        return _position < _posts.Count;
    }

    public Post Next()
    {
        if (!HasNext())
        {
            throw new InvalidOperationException("No more posts available");
        }
        return _posts[_position++];
    }
}
