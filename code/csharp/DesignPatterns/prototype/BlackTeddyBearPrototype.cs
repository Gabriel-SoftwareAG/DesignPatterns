using System;

namespace Prototype
{
    public class BlackTeddyBearPrototype : IPrototype
    {
        public IPrototype Clone()
        {
            Console.WriteLine("Cloning Black Teddy Bear");
            return new BlackTeddyBearPrototype();
        }
    }
}
