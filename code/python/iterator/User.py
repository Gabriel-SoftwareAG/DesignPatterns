
from BlogPlatform import BlogPlatform
from Post import Post

def main():
    blog = BlogPlatform()
    blog.add_post(Post("Title 1", "Author 1", "Summary 1"))
    blog.add_post(Post("Title 2", "Author 2", "Summary 2"))

    iterator = blog.create_iterator()
    while True:
        try:
            post = iterator.next()
            print(f" Title: {post.get_title()} Author: {post.get_author()} Summary: {post.get_summary()}")
        except StopIteration:
            break

if __name__ == "__main__":
    main()
