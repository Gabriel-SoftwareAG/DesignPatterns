import { LegalService } from "./LegalService";

export class RealLegalService implements LegalService {
    requestLegalAssistance(): void {
        console.log("Real legal service is providing legal assistance.");
    }

    provideLegalAssistance(): void {
        this.requestLegalAssistance();
    }
}
