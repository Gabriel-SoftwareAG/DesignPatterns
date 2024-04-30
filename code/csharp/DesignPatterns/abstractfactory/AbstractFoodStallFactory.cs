namespace AbstractFactory;

interface AbstractFoodStallFactory
{
    IceCream CreateIceCream();
    Pizza CreatePizza();
}
