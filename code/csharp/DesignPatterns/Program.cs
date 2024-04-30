using System;
using AbstractFactory;
using Adapter;
using Bridge;
using Builder;
using ChainOfResponsibility;
using Command;
using Composite;
using Decorator;
using facade;
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
        ParkVisitor.VisitPark();
        Traveler.AdapterExample();
        BridgeClient.BridgeExample();
        BuilderClient.BuilderExample();
        HelpDesk.ChainOfResponsibilityExample();
        CommandClient.CommandExample();
        MusicPlayer.CompositeExample();
        DecoratorClient.DecoratorExample();
        FacadeClient.FacadeExample();
        FactoryMethodClient.FactoryMethodExample();
        FlyweightClient.FlyweightExample();
        InterpreterClient.InterpreterExample();
        User.IteratorExample();
        AgileTeam.MediatorExample();
        MementoClient.MementoExample();
        ObserverClient.ObserverExample();
        PrototypeClient.PrototypeExample();
        ProxyClient.ProxyExample();
        Singleton.Client.Singleton();
        TrafficSystem.StateExample();
        StrategyClient.StrategyExample();
        TemplateMethodClient.TemplateMethodExample();
        Museum.VisitorExample();
    }
}
