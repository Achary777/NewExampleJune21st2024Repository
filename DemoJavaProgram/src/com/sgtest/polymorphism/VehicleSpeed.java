package com.sgtest.polymorphism;

abstract class VSpeed
{
    abstract void run();
}
class SportCar extends VSpeed
{
    void run()
    {
        System.out.println("Average F1 Sport Car running Speed 374.97 km/h");
    }
}
class Car extends VSpeed
{
    void run()
    {
        System.out.println("Average Car running Speed 30 km/h");
    }
}

public class VehicleSpeed {
    public static void main(String[] args) {
    VSpeed speed=null;
    SportCar sc=new SportCar();
    Car c=new Car();

    speed=sc;
    speed.run();

    speed=c;
    speed.run();

    }
}
