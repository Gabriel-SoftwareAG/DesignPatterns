package proxy;

public class Client {
    public static void main(String[] args) {
        ProxyLegalService proxyLegalService = new ProxyLegalService();
        proxyLegalService.requestLegalAssistance();
    }
}