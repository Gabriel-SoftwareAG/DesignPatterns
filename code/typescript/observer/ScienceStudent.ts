import { Student } from "./Student";

export class ScienceStudent implements Student {
    receiveUpdate(): void {
        console.log("Science student received an update from the teacher.");
    }
}
