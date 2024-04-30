using System;

namespace TemplateMethod
{
    class TraditionalHouseBuilder : HouseBuilder
    {
        protected override void BuildWalls()
        {
            Console.WriteLine("Building walls with bricks and mortar.");
        }

        protected override void InstallRoof()
        {
            Console.WriteLine("Installing a pitched roof with clay tiles.");
        }

        protected override void DoInterior()
        {
            Console.WriteLine("Doing interior with a classic design and wood furniture.");
        }
    }
}
