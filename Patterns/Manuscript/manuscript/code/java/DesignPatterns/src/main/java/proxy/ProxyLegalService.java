package proxy;

class ProxyLegalService implements LegalService {
    private RealLegalService realLegalService;

    @Override
    public void requestLegalAssistance() {
        if (realLegalService == null) {
            realLegalService = new RealLegalService();
        }
        realLegalService.provideLegalAssistance();
    }
}