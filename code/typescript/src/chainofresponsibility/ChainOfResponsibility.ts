import { LevelOneSupport } from './LevelOneSupport';
import { LevelTwoSupport } from './LevelTwoSupport';
import { SupportTicket } from './SupportTicket';


const levelOne = new LevelOneSupport();
const levelTwo = new LevelTwoSupport();

levelOne.setNext(levelTwo);

const ticket = new SupportTicket(1, "Cannot connect to the internet.");
levelOne.handleRequest(ticket);

const anotherTicket = new SupportTicket(2, "Computer does not start.");
levelOne.handleRequest(anotherTicket);
