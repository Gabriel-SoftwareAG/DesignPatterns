class Post:
    def __init__(self, title, author, summary):
        self.title = title
        self.author = author
        self.summary = summary

    def get_title(self):
        return self.title

    def get_author(self):
        return self.author

    def get_summary(self):
        return self.summary
