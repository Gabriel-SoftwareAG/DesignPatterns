import { BlogPlatform } from "./BlogPlatform";
import { Post } from "./Post";

export function Iterator(): void {
    let blog: BlogPlatform = new BlogPlatform();
    blog.addPost(new Post("Title 1", "Author 1", "Summary 1"));
    blog.addPost(new Post("Title 2", "Author 2", "Summary 2"));

    let iterator = blog.createIterator();
    while (iterator.hasNext()) {
        let post = iterator.next();
        console.log(`Title: ${post.title}, Author: ${post.author}, Summary: ${post.summary}`);
    }
}
