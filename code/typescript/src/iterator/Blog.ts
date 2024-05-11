import { Post } from "./Post";
import { Iterator } from "./Iterator";

export interface Blog {
    createIterator(): Iterator;
    addPost(post: Post): void;
}
