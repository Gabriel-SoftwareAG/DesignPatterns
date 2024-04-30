using System.Collections.Generic;

namespace Observer
{
    public class Teacher
    {
        private List<IStudent> _students = new List<IStudent>();

        public void AddStudent(IStudent student)
        {
            System.Console.WriteLine($"Teacher added a student {student.GetType().Name}");
            _students.Add(student);
        }

        public void RemoveStudent(IStudent student)
        {
            System.Console.WriteLine($"Teacher removed a student {student.GetType().Name}");
            _students.Remove(student);
        }

        public void NotifyStudents()
        {
            System.Console.WriteLine("Teacher is notifying students.");
            foreach (var student in _students)
            {
                student.ReceiveUpdate();
            }
        }
    }
}
