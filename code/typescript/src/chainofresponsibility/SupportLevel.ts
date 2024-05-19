import { SupportTicket } from "./SupportTicket";

export interface SupportLevel {
    setNext(next: SupportLevel): void;
    handleRequest(ticket: SupportTicket): void;
}
