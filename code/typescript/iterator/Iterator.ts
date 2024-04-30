import { Post } from "./Post";

export interface Iterator {
    hasNext(): boolean;
    next(): Post;
}
