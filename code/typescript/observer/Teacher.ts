import { Student } from "./Student";

export class Teacher {
    private students: Student[] = [];

    addStudent(student: Student): void {
        console.log(`Teacher added a student ${student.constructor.name}`);
        this.students.push(student);
    }

    removeStudent(student: Student): void {
        console.log(`Teacher removed a student ${student.constructor.name}`);
        const index = this.students.indexOf(student);
        if (index !== -1) {
            this.students.splice(index, 1);
        }
    }

    notifyStudents(): void {
        console.log("Teacher is notifying students.");
        this.students.forEach(student => {
            student.receiveUpdate();
        });
    }
}
