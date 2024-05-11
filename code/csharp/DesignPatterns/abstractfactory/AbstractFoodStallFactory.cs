namespace AbstractFactory;

interface IAbstractFoodStallFactory
{
    IIceCream CreateIceCream();
    Pizza CreatePizza();
}
