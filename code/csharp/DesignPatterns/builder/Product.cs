namespace Builder;
using System;
using System.Collections.Generic;

class Product
{
    private List<string> _parts = new List<string>();

    public void AddPart(string part)
    {
        _parts.Add(part);
    }

    public void Show()
    {
        Console.WriteLine("Custom Sandwich Ingredients:");
        foreach (string part in _parts)
        {
            Console.WriteLine($"- {part}");
        }
    }
}
