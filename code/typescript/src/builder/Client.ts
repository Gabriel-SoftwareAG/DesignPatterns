import { Builder } from "./Builder";
import { ConcreteBuilder } from "./ConcreteBuilder";
import { Director } from "./Director";
import { Product } from "./Product";


// Create a ConcreteBuilder instance
let builder: Builder = new ConcreteBuilder();

// Create a Director instance and pass the builder
let director: Director = new Director(builder);

// Construct the custom sandwich
director.constructSandwich();

// Get the final product (sandwich) from the builder
let sandwich: Product = builder.getProduct();

// Display the custom sandwich ingredients
sandwich.show();
