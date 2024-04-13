package observer;

import java.util.ArrayList;
import java.util.List;

class Teacher {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void notifyStudents() {
        for (Student student : students) {
            student.receiveUpdate();
        }
    }
}
