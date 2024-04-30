namespace Mediator
{
    public class AgileTeam
    {
        public static void MediatorExample()
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

