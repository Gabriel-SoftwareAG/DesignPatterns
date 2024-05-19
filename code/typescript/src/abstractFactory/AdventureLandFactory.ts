import { AbstractFoodStallFactory } from './AbstractFoodStallFactory';
import { IceCream } from './IceCream';
import { Pizza } from './Pizza';
import { TropicalIceCream } from './TropicalIceCream';
import { ExoticPizza } from './ExoticPizza';

export class AdventureLandFactory implements AbstractFoodStallFactory {
    createIceCream(): IceCream {
        console.log("Creating tropical-themed ice cream");
        return new TropicalIceCream();
    }

    createPizza(): Pizza {
        console.log("Creating exotic-themed pizza");
        return new ExoticPizza();
    }
}
