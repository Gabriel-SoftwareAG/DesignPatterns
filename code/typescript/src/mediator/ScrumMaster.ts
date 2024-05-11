import { Colleague } from "./Colleague";
import { Mediator } from "./Mediator";
import { Developer } from "./Developer";
import { Tester } from "./Tester";

export class ScrumMaster implements Mediator {
    private developer!: Developer;
    private tester!: Tester;

    setDeveloper(developer: Developer): void {
        this.developer = developer;
    }

    setTester(tester: Tester): void {
        this.tester = tester;
    }

    request(message: string, colleague: Colleague): void {
        if (colleague instanceof Developer) {
            this.tester.receive(message);
        } else if (colleague instanceof Tester) {
            this.developer.receive(message);
        }
    }

    response(message: string, colleague: Colleague): void {
        console.log(`Scrum Master handling response: ${message}`);
    }
}
