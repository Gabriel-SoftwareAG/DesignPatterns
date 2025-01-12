class Director:
    def __init__(self, builder):
        self.builder = builder

    def construct_sandwich(self):
        self.builder.build_part_a()
        self.builder.build_part_b()
        self.builder.build_part_c()
