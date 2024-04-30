using System;

namespace Proxy
{
    public class ProxyClient
    {
        public static void Proxy()
        {
            ProxyLegalService proxyLegalService = new ProxyLegalService();
            proxyLegalService.RequestLegalAssistance();
        }
    }
}
