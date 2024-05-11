import { SupportTicket } from "./SupportTicket";

export interface ISupportLevel {
    setNext(next: ISupportLevel): void;
    handleRequest(ticket: SupportTicket): void;
}
