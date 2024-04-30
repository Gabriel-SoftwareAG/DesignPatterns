import { Student } from "./Student";

export class MathStudent implements Student {
    receiveUpdate(): void {
        console.log("Math student received an update from the teacher.");
    }
}
