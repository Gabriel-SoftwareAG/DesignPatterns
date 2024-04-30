using System;

namespace Proxy
{
    public class ProxyLegalService : ILegalService
    {
        private RealLegalService _realLegalService;

        public void RequestLegalAssistance()
        {
            if (_realLegalService == null)
            {
                _realLegalService = new RealLegalService();
            }

            Console.WriteLine("Proxy legal service is requesting legal assistance.");
            _realLegalService.ProvideLegalAssistance();
        }
    }
}
