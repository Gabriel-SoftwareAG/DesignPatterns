namespace TemplateMethod;
using System;

abstract class HouseBuilder
{
    // The template method defining the sequence of steps to build a house.
    public void BuildHouse()
    {
        LayFoundation();
        BuildWalls();
        InstallRoof();
        DoInterior();
    }

    // Common step implemented in the abstract class itself.
    private void LayFoundation()
    {
        Console
            .WriteLine("Laying the foundation with concrete and steel bars.");
    }

    // Steps that need to be implemented by subclasses.
    protected abstract void BuildWalls();

    protected abstract void InstallRoof();

    protected abstract void DoInterior();
}
