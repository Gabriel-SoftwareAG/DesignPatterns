import { ISupportLevel } from "./ISupportLevel";
import { SupportTicket } from "./SupportTicket";

export class LevelOneSupport implements ISupportLevel {
    private next: ISupportLevel;

    setNext(next: ISupportLevel): void {
        this.next = next;
        console.log(`Level one support setting next level to ${next.constructor.name} Support`);
    }

    handleRequest(ticket: SupportTicket): void {
        if (ticket.level <= 1) {
            console.log(`Level One Support handling ticket: ${ticket.description}`);
            console.log("Ticket resolved.");
        } else {
            console.log(`Level One Support cannot handle ticket: ${ticket.description} Escalating to next level.`);
            this.next.handleRequest(ticket);
            console.log("Ticket returned to level one after being resolved.");
        }
    }
}
