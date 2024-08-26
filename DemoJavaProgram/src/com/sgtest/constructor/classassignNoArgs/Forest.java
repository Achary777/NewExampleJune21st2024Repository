package com.sgtest.constructor.classassignNoArgs;
class NationalPark
{
    String npName;
    String location;
    int range;
    int cost;

    NationalPark()
    {
        npName="Bandipur National Park";
        location="Karnataka State";
        range=874;
        cost=650;
        System.out.println("National park Name : "+npName);
        System.out.println("Located state : "+location);
        System.out.println("Forested reserve in sq.-km : "+range);
        System.out.println("Ticket cost for Safari : "+cost);
        System.out.println("--------------------------------");


    }


}
class Thempark
{
    String parkName;
    String location;
    int games;
    int cost;

    Thempark()
    {
        parkName="Wonderla Amusement Park";
        location="Bengaluru, Karnataka";
        games=25;
        cost=800;
        System.out.println("Park Name : "+parkName);
        System.out.println("Located in"+location);
        System.out.println("No of Game Available : "+games);
        System.out.println("Ticket Price per person : "+cost);
    }
}

public class Forest
{
    public static void main(String[] args)
    {
        NationalPark np=new NationalPark();
        Thempark ap=new Thempark();
    }
}
