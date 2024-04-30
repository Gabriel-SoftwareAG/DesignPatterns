namespace Prototype;
using System;

public class PrototypeClient
{
    public static void PrototypeExample()
    {
        IPrototype teddyBear1 = new WhiteTeddyBearPrototype();
        IPrototype teddyBear2 = new BlackTeddyBearPrototype();

        IPrototype clonedTeddyBear1 = teddyBear1.Clone();
        IPrototype clonedTeddyBear2 = teddyBear2.Clone();

        Console.WriteLine($"Cloned Teddy Bear 1: {clonedTeddyBear1
                                                            .GetType().Name}");
        
        Console.WriteLine($"Cloned Teddy Bear 2: {clonedTeddyBear2
                                                            .GetType().Name}");
    }
}
