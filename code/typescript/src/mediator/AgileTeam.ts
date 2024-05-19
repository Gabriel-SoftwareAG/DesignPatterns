import { ScrumMaster } from './ScrumMaster';
import { Developer } from './Developer';
import { Tester } from './Tester';

const scrumMaster = new ScrumMaster();
const developer = new Developer(scrumMaster);
const tester = new Tester(scrumMaster);

// Set up the mediator relationships
scrumMaster.setDeveloper(developer);
scrumMaster.setTester(tester);

// Simulate interactions
developer.send("Feature development complete. Need testing.");
tester.send("Testing complete. Feature ready for production.");
