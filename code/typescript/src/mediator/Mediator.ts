import { Colleague } from "./Colleague";

export interface Mediator {
    request(message: string, colleague: Colleague): void;
    response(message: string, colleague: Colleague): void;
}
