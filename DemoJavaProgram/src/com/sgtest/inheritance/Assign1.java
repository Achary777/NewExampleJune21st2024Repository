package com.sgtest.inheritance;

// Q: WAP for Multi Level Inheritance ?
class Vehicle
{
    void bike1(String name)
    {
        System.out.println("Name of bike : "+name);

    }
}
class Vehicle1 extends Vehicle
{
    void bike2( int mileage)
    {
        System.out.println("Bike mileage in kmpl : "+mileage);
    }
}
class Vehicle2 extends Vehicle1
{
    void bike3(int price)
    {
        System.out.println("Price of bike in thousands : "+price);
    }
}
public class Assign1 {
    public static void main(String[] args) {
        Vehicle2 obj=new Vehicle2();
        obj.bike1("HERO DELUX");
        obj.bike2(65);
        obj.bike3(80000);
    }
}
