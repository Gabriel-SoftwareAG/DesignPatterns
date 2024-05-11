namespace Proxy;
using System;

class RealLegalService : ILegalService
{
    public void RequestLegalAssistance()
    {
        Console.WriteLine("Real legal service is providing legal assistance.");
    }

    public void ProvideLegalAssistance()
    {
        RequestLegalAssistance();
    }
}
