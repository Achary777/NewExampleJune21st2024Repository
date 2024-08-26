package com.sgtest.constructor.assigncostructor;

class Fruit
{
    String FruitName;
    String FruColor;
    String Fruseedless;
    int FruPrice;
}
class Flower
{
    String FlowerName;
    String FlowerColor;
    String Fragrance;
    String Florprice;
}
class Vegitable
{
    String VegiName;
    String Vegitype;
    String Vegicolor;
    int VegiPrice;
}
public class AssignFruFloVeg
{

    public static void main(String[] args)
    {
        Fruit fru =new Fruit();
            fru.FruitName="Apple";
            fru.FruColor="Red/Green";
            fru.Fruseedless="Yes";
            fru.FruPrice=100;
            System.out.println("Name of Fruit is : "+fru.FruitName);
            System.out.println("Color of Fruit : "+fru.FruColor);
            System.out.println("Seed less Fruit : "+fru.Fruseedless);
            System.out.println("Price of Fruit in per KG : "+fru.FruPrice);
            System.out.println("---------------------------------------");

        Flower Flo =new Flower();
            Flo.FlowerName="Kadupul Flower";
            Flo.FlowerColor="White or Yellow";
            Flo.Fragrance="Sweet";
            Flo.Florprice="Priceless";
            System.out.println("Name of Flower : "+Flo.FlowerName);
            System.out.println("Color of Flower : "+Flo.FlowerColor);
            System.out.println("Flower Fragrance : "+Flo.Fragrance);
            System.out.println("Flower price : "+Flo.Florprice);
            System.out.println("------------------------------------");

        Vegitable veg = new Vegitable();
            veg.VegiName="Beetroot";
            veg.Vegicolor="Dark purplish red";
            veg.Vegitype="Tap root";
            veg.VegiPrice=45;
        System.out.println("Vegitable name : "+veg.VegiName);
        System.out.println("Vegitable color : "+veg.Vegicolor);
        System.out.println("Vegitable type : "+veg.Vegitype);
        System.out.println("Vegitable price per KG : "+veg.VegiPrice);
    }
}
