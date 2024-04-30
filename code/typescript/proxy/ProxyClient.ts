import { ProxyLegalService } from "./ProxyLegalService";

export function Proxy(): void {
    const proxyLegalService = new ProxyLegalService();
    proxyLegalService.requestLegalAssistance();
}
