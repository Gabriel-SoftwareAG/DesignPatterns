from ScrumMaster import ScrumMaster
from Developer import Developer
from Tester import Tester

if __name__ == "__main__":
    scrum_master = ScrumMaster()
    developer = Developer(scrum_master)
    tester = Tester(scrum_master)

    scrum_master.set_developer(developer)
    scrum_master.set_tester(tester)

    developer.send("Feature development complete. Need testing.")
    tester.send("Testing complete. Feature ready for production.")
