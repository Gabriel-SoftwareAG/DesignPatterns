namespace TemplateMethod;
using System;

class TemplateMethodClient
{


    public static void TemplateMethodExample()
    {
        HouseBuilder modernBuilder = new ModernHouseBuilder();
        modernBuilder.BuildHouse(); // Builds a modern house

        Console.WriteLine("----------");

        HouseBuilder traditionalBuilder = new TraditionalHouseBuilder();
        traditionalBuilder.BuildHouse(); // Builds a traditional house
    }
}
