namespace Observer
{
    public class ScienceStudent : IStudent
    {
        public void ReceiveUpdate()
        {
            System.Console.WriteLine("Science student received an update from the teacher.");
        }
    }
}
