package com.sgtest.polymorphism;

abstract class VehicleType
{
    abstract void Transport();
}
class Goods extends VehicleType
{
    void Transport()
    {
        System.out.println("Trucks are used for Goods Transportation");
    }
}
class PublicTransport extends VehicleType
{
    void Transport()
    {
        System.out.println("Buses are used for Public Transportation");
    }
}
class Patients extends VehicleType
{
    void Transport()
    {
        System.out.println("Ambulances are used for Patients Transportation");
    }
}

public class Vehicle
{
    public static void main(String[] args) {
        VehicleType type=null;
        Goods o=new Goods();
        PublicTransport o1=new PublicTransport();
        Patients o2=new Patients();

        type=o;
        type.Transport();

        type=o1;
        type.Transport();

        type=o2;
        type.Transport();
    }
}
