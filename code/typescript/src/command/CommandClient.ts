import { PreparePizzaCommand } from "./PreparePizzaCommand";
import { ServePastaCommand } from "./ServePastaCommand";
import { Receiver } from "./Receiver";
import { Waiter } from "./Waiter";

const chef = new Receiver();
const preparePizzaCommand = new PreparePizzaCommand(chef);
const servePastaCommand = new ServePastaCommand(chef);
const waiter = new Waiter();

waiter.setCommand(preparePizzaCommand);
waiter.executeCommand();

waiter.setCommand(servePastaCommand);
waiter.executeCommand();
