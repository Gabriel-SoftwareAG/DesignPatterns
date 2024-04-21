package proxy;

class Client {
    public static void main(String[] args) {
        ProxyLegalService proxyLegalService = new ProxyLegalService();
        proxyLegalService.requestLegalAssistance();
    }
}