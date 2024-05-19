import { SupportLevel } from "./SupportLevel";
import { SupportTicket } from "./SupportTicket";

export class LevelTwoSupport implements SupportLevel {
    private next?: SupportLevel;

    setNext(next: SupportLevel): void {
        this.next = next;
        console.log(`Setting next level to ${next.constructor.name} Support`);
    }

    handleRequest(ticket: SupportTicket): void {
        console.log(`Level Two Support handling ticket: ${ticket.description}`);
        console.log("Ticket resolved.");
    }
}
