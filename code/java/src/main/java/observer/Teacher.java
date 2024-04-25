package observer;

import java.util.ArrayList;
import java.util.List;

class Teacher {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        System.out.println("Teacher added a student " + student.getClass().getName());
        students.add(student);
    }

    public void removeStudent(Student student) {
        System.out.println("Teacher removed a student " + student.getClass().getName());
        students.remove(student);
    }

    public void notifyStudents() {
        System.out.println("Teacher is notifying students.");
        for (Student student : students) {
            student.receiveUpdate();
        }
    }
}
