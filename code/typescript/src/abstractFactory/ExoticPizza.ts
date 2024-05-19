import { Pizza } from './Pizza';

export class ExoticPizza implements Pizza {
    enjoy(): void {
        console.log("Enjoy exotic-themed pizza");
    }
}
