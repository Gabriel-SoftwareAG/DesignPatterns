from Student import Student


class MathStudent(Student):
    def receive_update(self):
        print("Math student received an update from the teacher.")
