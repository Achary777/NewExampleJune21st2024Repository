package com.sgtest.inheritance;

// Q2: WAP for HYBRID Inheritance ?
class Product1
{
    void biscute(String name)
    {
        System.out.println("Name of Biscute : "+name);
    }
}
class Product2 extends Product1
{
    void biscute1(int type)
    {
        System.out.println("Types of Biscute products : "+type);

    }
}
class Product3 extends Product1
{
    void biscute2(String location)
    {
        System.out.println("Manufacturing location : "+location);
    }
}
class Product4 extends Product3
{
    void biscute3(int peaces)
    {
        System.out.println("No peaces in Single packet : "+peaces);
    }
}
public class Assign2 {
    public static void main(String[] args) {
        Product2 obj=new Product2();
        obj.biscute1(5);
        obj.biscute("BRITANIA");
        System.out.println("------------------------------------------");
        Product4 obj1=new Product4();
        obj1.biscute3(10);
        obj1.biscute2("NELAMGALA");
        obj1.biscute("BRITANIA");
    }
}
