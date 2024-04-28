class Teacher:
    def __init__(self):
        self.students = []

    def add_student(self, student):
        print(f"Teacher added a student {type(student).__name__}")
        self.students.append(student)

    def remove_student(self, student):
        print(f"Teacher removed a student {type(student).__name__}")
        self.students.remove(student)

    def notify_students(self):
        print("Teacher is notifying students.")
        for student in self.students:
            student.receive_update()
