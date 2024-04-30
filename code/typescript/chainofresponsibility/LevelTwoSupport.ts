import { ISupportLevel } from "./ISupportLevel";
import { SupportTicket } from "./SupportTicket";

export class LevelTwoSupport implements ISupportLevel {
    private next: ISupportLevel;

    setNext(next: ISupportLevel): void {
        this.next = next;
        console.log(`Setting next level to ${next.constructor.name} Support`);
    }

    handleRequest(ticket: SupportTicket): void {
        console.log(`Level Two Support handling ticket: ${ticket.description}`);
        console.log("Ticket resolved.");
    }
}
