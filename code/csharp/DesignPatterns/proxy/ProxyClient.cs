namespace Proxy;
using System;

public class ProxyClient
{
    public static void ProxyExample()
    {
        ProxyLegalService proxyLegalService = new ProxyLegalService();
        proxyLegalService.RequestLegalAssistance();
    }
}
