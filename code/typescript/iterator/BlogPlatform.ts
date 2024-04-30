import { Blog } from "./Blog";
import { Post } from "./Post";
import { PostIterator } from "./PostIterator";

export class BlogPlatform implements Blog {
    private posts: Post[] = [];

    addPost(post: Post): void {
        this.posts.push(post);
    }

    createIterator(): PostIterator {
        return new PostIterator(this.posts);
    }
}
