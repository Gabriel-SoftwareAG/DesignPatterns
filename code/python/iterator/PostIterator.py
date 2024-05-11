from Iterator import Iterator


class PostIterator(Iterator):
    def __init__(self, posts):
        self.posts = posts
        self.index = 0

    def has_next(self):
        return self.index < len(self.posts)

    def next(self):
        if self.has_next():
            post = self.posts[self.index]
            self.index += 1
            return post
        else:
            raise StopIteration
