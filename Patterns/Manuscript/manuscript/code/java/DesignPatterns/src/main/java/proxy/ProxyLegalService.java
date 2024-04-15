package proxy;

class ProxyLegalService implements LegalService {
    private RealLegalService realLegalService;

    @Override
    public void requestLegalAssistance() {
        if (realLegalService == null) {
            realLegalService = new RealLegalService();
        }

        // Add additional logic done by the proxy
        System.out.println("Proxy legal service is requesting legal assistance.");
        realLegalService.provideLegalAssistance();
    }
}