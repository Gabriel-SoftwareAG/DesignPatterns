import { Pizza } from './Pizza';

export class EnchantedPizza implements Pizza {
    enjoy(): void {
        console.log("Enjoy enchanted-themed pizza");
    }
}
