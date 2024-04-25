package iterator;

import java.util.List;
import java.util.NoSuchElementException;

class PostIterator implements Iterator {
    private List<Post> posts;
    private int position;

    public PostIterator(List<Post> posts) {
        this.posts = posts;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < posts.size();
    }

    @Override
    public Post next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more posts available");
        }
        Post post = posts.get(position);
        position++;
        return post;
    }
}
