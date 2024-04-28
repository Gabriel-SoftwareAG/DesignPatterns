class Product:
    def __init__(self):
        self.parts = []

    def add_part(self, part):
        self.parts.append(part)

    def show(self):
        print("Custom Sandwich Ingredients:")
        for part in self.parts:
            print(f"- {part}")
