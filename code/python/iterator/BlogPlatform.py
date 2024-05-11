from Blog import Blog
from PostIterator import PostIterator


class BlogPlatform(Blog):
    def __init__(self):
        self.posts = []

    def add_post(self, post):
        self.posts.append(post)

    def create_iterator(self):
        return PostIterator(self.posts)
