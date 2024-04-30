namespace Observer;
public class MathStudent : IStudent
{
    public void ReceiveUpdate()
    {
        System.Console.WriteLine("Math student received an update from the teacher.");
    }
}
