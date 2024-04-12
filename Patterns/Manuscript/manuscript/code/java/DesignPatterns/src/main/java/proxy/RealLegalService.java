package proxy;

class RealLegalService implements LegalService {
    @Override
    public void requestLegalAssistance() {
        System.out.println("Real legal service is providing legal assistance.");
    }

    public void provideLegalAssistance() {
        requestLegalAssistance();
    }
}
