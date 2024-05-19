import { AbstractFoodStallFactory } from './AbstractFoodStallFactory';
import { IceCream } from './IceCream';
import { Pizza } from './Pizza';
import { AdventureLandFactory } from './AdventureLandFactory';
import { FantasyLandFactory } from './FantasyLandFactory';

// Choose themed area (factory)
const adventureLandFactory: AbstractFoodStallFactory = new AdventureLandFactory();
const fantasyLandFactory: AbstractFoodStallFactory = new FantasyLandFactory();

// Order themed food items
const tropicalIceCream: IceCream = adventureLandFactory.createIceCream();
const exoticPizza: Pizza = adventureLandFactory.createPizza();

const magicalIceCream: IceCream = fantasyLandFactory.createIceCream();
const enchantedPizza: Pizza = fantasyLandFactory.createPizza();

// Enjoy themed food items
tropicalIceCream.enjoy();
exoticPizza.enjoy();
magicalIceCream.enjoy();
enchantedPizza.enjoy();
