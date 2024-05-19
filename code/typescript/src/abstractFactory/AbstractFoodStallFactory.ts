import { IceCream } from './IceCream';
import { Pizza } from './Pizza';

export interface AbstractFoodStallFactory {
    createIceCream(): IceCream;
    createPizza(): Pizza;
}
