import { LevelOneSupport } from "./LevelOneSupport";
import { LevelTwoSupport } from "./LevelTwoSupport";
import { SupportTicket } from "./SupportTicket";

export function ChainOfResponsibility(): void {
    let levelOne = new LevelOneSupport();
    let levelTwo = new LevelTwoSupport();

    levelOne.setNext(levelTwo);

    let ticket = new SupportTicket(
