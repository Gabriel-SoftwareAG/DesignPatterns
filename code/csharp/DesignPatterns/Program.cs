using System;
using Bridge;
using FactoryMethod;
using Flyweight;
using Interpreter;
using Iterator;
using Mediator;
using Memento;
using Observer;
using Prototype;
using Proxy;
using Singleton;
using State;
using Strategy;
using TemplateMethod;
using Visitor;

public class Program
{
    public static void Main(string[] args)
    {
        //ParkVisitor.VisitPark();
        //Singleton.RunSingleton();
        //Visitor.RunVisitor();
        //AdapterClient.Adapter();
        //BridgeClient.Bridge();
        //BuilderClient.Builder();
        // ChainOfResponsibilityClient.ChainOfResponsibility();
        // CommandClient.Command();
        //CompositeClient.Composite();
        //DecoratorClient.Decorator();
        // FacadeClient.Facade();
        // FactoryMethodClient.FactoryMethod();
        // FlyweightClient.Flyweight();
        // InterpreterClient.Interpreter();
        // IteratorClient.Iterator();
        // MediatorClient.Mediator();
        // MementoClient.Memento();
        // ObserverClient.Observer();
        // PrototypeClient.Prototype();
        // ProxyClient.Proxy();
        // SingletonClient.Singleton();
        // StateClient.State();
        // StrategyMain.Strategy();
        // TemplateMethodClient.TemplateMethod();
        BridgeClient.BridgeExample();
    }
}
