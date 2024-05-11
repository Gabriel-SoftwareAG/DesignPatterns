import { Visitor } from "./Visitor";
import { Exhibit } from "./Exhibit";
import { Painting } from "./Painting";
import { Sculpture } from "./Sculpture";
import { Patron } from "./Patron";

let painting: Exhibit = new Painting();
let sculpture: Exhibit = new Sculpture();

let patron: Visitor = new Patron();

painting.accept(patron); // Patron interacts with a painting exhibit
sculpture.accept(patron); // Patron interacts with a sculpture exhibit