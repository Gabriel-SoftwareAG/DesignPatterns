using System;

namespace TemplateMethod
{
    class ModernHouseBuilder : HouseBuilder
    {
        protected override void BuildWalls()
        {
            Console.WriteLine("Building walls with glass and steel.");
        }

        protected override void InstallRoof()
        {
            Console.WriteLine("Installing a flat, green roof.");
        }

        protected override void DoInterior()
        {
            Console.WriteLine("Doing interior with an open concept design and minimalist furniture.");
        }
    }
}
