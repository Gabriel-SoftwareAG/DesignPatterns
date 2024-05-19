import { LegalService } from "./LegalService";
import { RealLegalService } from "./RealLegalService";

export class ProxyLegalService implements LegalService {
    private realLegalService?: RealLegalService;

    requestLegalAssistance(): void {
        if (!this.realLegalService) {
            this.realLegalService = new RealLegalService();
        }

        console.log("Proxy legal service is requesting legal assistance.");
        this.realLegalService.provideLegalAssistance();
    }
}
