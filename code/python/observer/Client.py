from Teacher import Teacher
from MathStudent import MathStudent
from ScienceStudent import ScienceStudent

def main():
    teacher = Teacher()

    math_student = MathStudent()
    science_student = ScienceStudent()

    teacher.add_student(math_student)
    teacher.add_student(science_student)

    teacher.notify_students()

if __name__ == "__main__":
    main()
