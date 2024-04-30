namespace Mediator
{
    public class MediatorClient
    {
        public static void Mediator()
        {
            ScrumMaster scrumMaster = new ScrumMaster();
            Developer developer = new Developer(scrumMaster);
            Tester tester = new Tester(scrumMaster);

            scrumMaster.SetDeveloper(developer);
            scrumMaster.SetTester(tester);

            developer.Send("Feature development complete. Need testing.");
            tester.Send("Testing complete. Feature ready for production.");
        }
    }
}

