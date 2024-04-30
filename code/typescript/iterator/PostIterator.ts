import { Iterator } from "./Iterator";
import { Post } from "./Post";

export class PostIterator implements Iterator {
    private position = 0;

    constructor(private posts: Post[]) {}

    hasNext(): boolean {
        return this.position < this.posts.length;
    }

    next(): Post {
        if (!this.hasNext()) {
            throw new Error("No more posts available");
        }
        return this.posts[this.position++];
    }
}
