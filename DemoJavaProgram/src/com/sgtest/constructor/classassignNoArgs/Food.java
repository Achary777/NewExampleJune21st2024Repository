package com.sgtest.constructor.classassignNoArgs;
class Restaurant
{
    String resName;
    String resType;
    String resTime;

    Restaurant()
    {
        resName="NammaUpahara";
        resType="Pure Vegetarian";
        resTime="5am to 1pm";
        System.out.println("Name of Restaurant : "+resName);
        System.out.println("Type Of Restuarant : "+resType);
        System.out.println("Timings of Restaurant : "+resTime);
        System.out.println("-------------------------------------");
    }
}
class FoodDelivery
{
    String appName;
    int range;
    int price;

    FoodDelivery()
    {
        appName="Namma Delivery";
        range=10;
        price=45;
        System.out.println("Delivery App Name : "+appName);
        System.out.println("Delivery range upto in km : "+range);
        System.out.println("Charges per delivery : "+price);

    }
}

public class Food
{
    public static void main(String[] args)
    {
        Restaurant res=new Restaurant();
        FoodDelivery fd=new FoodDelivery();

    }
}
