import { SupportLevel } from "./SupportLevel";
import { SupportTicket } from "./SupportTicket";

export class LevelOneSupport implements SupportLevel {
    private next?: SupportLevel;

    setNext(next: SupportLevel): void {
        this.next = next;
        console.log(`Level one support setting next level to ${next.constructor.name} Support`);
    }

    handleRequest(ticket: SupportTicket): void {
        if (ticket.level <= 1) {
            console.log(`Level One Support handling ticket: ${ticket.description}`);
            console.log("Ticket resolved.");
        } else if (this.next) {
            console.log(`Level One Support cannot handle ticket: ${ticket.description} Escalating to next level.`);
            this.next.handleRequest(ticket);
            console.log("Ticket returned to level one after being resolved.");
        } else {
            console.log("No next level support available to handle the ticket.");
        }
    }
}
