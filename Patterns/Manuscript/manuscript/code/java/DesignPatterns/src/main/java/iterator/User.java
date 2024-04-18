package iterator;

class User {
    public static void main(String[] args) {
        Blog blog = new BlogPlatform();
        blog.addPost(new Post("Title 1", "Author 1", "Summary 1"));
        blog.addPost(new Post("Title 2", "Author 2", "Summary 2"));

        Iterator iterator = blog.createIterator();
        while (iterator.hasNext()) {
            Post post = iterator.next();
            System.out.print(" Title: " + post.getTitle());
            System.out.print(" Author: " + post.getAuthor());
            System.out.println(" Summary: " + post.getSummary());
        }
    }
}