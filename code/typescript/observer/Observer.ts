import { Teacher } from "./Teacher";
import { MathStudent } from "./MathStudent";
import { ScienceStudent } from "./ScienceStudent";

export function Observer(): void {
    let teacher = new Teacher();
    let mathStudent = new MathStudent();
    let scienceStudent = new ScienceStudent();

    teacher.addStudent(mathStudent);
    teacher.addStudent(scienceStudent);

    teacher.notifyStudents();
}
