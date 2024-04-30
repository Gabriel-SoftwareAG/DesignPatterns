import { IBuilder } from "./IBuilder";

export class Director {
    private builder: IBuilder;

    constructor(builder: IBuilder) {
        this.builder = builder;
    }

    public constructSandwich(): void {
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
    }
}
