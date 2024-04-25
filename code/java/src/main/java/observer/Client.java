package observer;

class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        // Students interested in updates
        Student mathStudent = new MathStudent();
        Student scienceStudent = new ScienceStudent();

        // Teacher adds students
        teacher.addStudent(mathStudent);
        teacher.addStudent(scienceStudent);

        // Teacher broadcasts an update
        teacher.notifyStudents();
    }
}
