import { HouseBuilder } from "./HouseBuilder";
import { ModernHouseBuilder } from "./ModernHouseBuilder";
import { TraditionalHouseBuilder } from "./TraditionalHouseBuilder";

let modernBuilder: HouseBuilder = new ModernHouseBuilder();
modernBuilder.buildHouse(); // Builds a modern house

console.log("----------");

let traditionalBuilder: HouseBuilder = new TraditionalHouseBuilder();
traditionalBuilder.buildHouse(); // Builds a traditional house
