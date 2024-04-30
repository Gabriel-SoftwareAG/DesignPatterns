using System;

namespace Prototype
{
    public class WhiteTeddyBearPrototype : IPrototype
    {
        public IPrototype Clone()
        {
            Console.WriteLine("Cloning White Teddy Bear");
            return new WhiteTeddyBearPrototype();
        }
    }
}
