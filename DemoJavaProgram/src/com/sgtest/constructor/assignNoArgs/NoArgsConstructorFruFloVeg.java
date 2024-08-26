package com.sgtest.constructor.assignNoArgs;

class Fruit1
{
    String FruitName;
    String FruColor;
    String Fruseedless;
    int FruPrice;

    Fruit1()
    {
        FruitName="Apple";
        FruColor="Red/Green";
        Fruseedless="Yes";
        FruPrice=100;
        System.out.println("Name of Fruit is : "+FruitName);
        System.out.println("Color of Fruit : "+FruColor);
        System.out.println("Seed less Fruit : "+Fruseedless);
        System.out.println("Price of Fruit in per KG : "+FruPrice);
        System.out.println("---------------------------------------");
    }
}
class Flower1
{
    String FlowerName;
    String FlowerColor;
    String Fragrance;
    String Florprice;

    Flower1()
    {
        FlowerName="Kadupul Flower";
        FlowerColor="White or Yellow";
        Fragrance="Sweet";
        Florprice="Priceless";
        System.out.println("Name of Flower : "+FlowerName);
        System.out.println("Color of Flower : "+FlowerColor);
        System.out.println("Flower Fragrance : "+Fragrance);
        System.out.println("Flower price : "+Florprice);
        System.out.println("------------------------------------");
    }
}
class Vegitable1
{
    String VegiName;
    String Vegitype;
    String Vegicolor;
    int VegiPrice;

    Vegitable1()
    {
        VegiName="Beetroot";
        Vegicolor="Dark purplish red";
        Vegitype="Tap root";
        VegiPrice=45;
        System.out.println("Vegitable name : "+VegiName);
        System.out.println("Vegitable color : "+Vegicolor);
        System.out.println("Vegitable type : "+Vegitype);
        System.out.println("Vegitable price per KG : "+VegiPrice);
    }
}
public class NoArgsConstructorFruFloVeg
{

    public static void main(String[] args)
    {
        Fruit1 fru =new Fruit1();
        Flower1 Flo =new Flower1();
        Vegitable1 veg = new Vegitable1();
    }
}
