import { AbstractFoodStallFactory } from './AbstractFoodStallFactory';
import { IceCream } from './IceCream';
import { Pizza } from './Pizza';
import { MagicalIceCream } from './MagicalIceCream';
import { EnchantedPizza } from './EnchantedPizza';

export class FantasyLandFactory implements AbstractFoodStallFactory {
    createIceCream(): IceCream {
        console.log("Creating magical-themed ice cream");
        return new MagicalIceCream();
    }

    createPizza(): Pizza {
        console.log("Creating enchanted-themed pizza");
        return new EnchantedPizza();
    }
}
