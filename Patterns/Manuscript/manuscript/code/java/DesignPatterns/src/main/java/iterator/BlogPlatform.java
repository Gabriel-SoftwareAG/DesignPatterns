package iterator;

import java.util.ArrayList;
import java.util.List;

class BlogPlatform implements Blog {
    private List<Post> posts;

    public BlogPlatform() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    @Override
    public Iterator createIterator() {
        return new PostIterator(posts);
    }
}
