import { Builder } from "./Builder";

export class Director {
    private builder: Builder;

    constructor(builder: Builder) {
        this.builder = builder;
    }

    public constructSandwich(): void {
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
    }
}
