package mediator;

class AgileTeam {
    public static void main(String[] args) {
        ScrumMaster scrumMaster = new ScrumMaster();
        Developer developer = new Developer(scrumMaster);
        Tester tester = new Tester(scrumMaster);

        scrumMaster.setDeveloper(developer);
        scrumMaster.setTester(tester);

        developer.send("Feature development complete. Need testing.");
        tester.send("Testing complete. Feature ready for production.");
    }
}
