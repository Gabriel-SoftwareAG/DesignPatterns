namespace Observer;

public class ObserverClient
{
    public static void ObserverExample()
    {
        Teacher teacher = new Teacher();
        IStudent mathStudent = new MathStudent();
        IStudent scienceStudent = new ScienceStudent();

        teacher.AddStudent(mathStudent);
        teacher.AddStudent(scienceStudent);

        teacher.NotifyStudents();
    }
}
