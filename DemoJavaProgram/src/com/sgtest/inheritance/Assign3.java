package com.sgtest.inheritance;

    //Q3: WAP for Hierarchical ?

class AnimalProduct1
{
    void Animal(String name)
    {
        System.out.println("Name of Animal :"+name);
    }
}
class AnimalProduct2 extends AnimalProduct1
{
    void Animal1(String name1)
    {
        System.out.println("Name of Cow product 1 : "+name1);
    }
}
class AnimalProduct3 extends AnimalProduct1
{
    void Animal2(int litres)
    {
        System.out.println("No of litres milk p roduced per day : "+litres);
    }
}
public class Assign3 {
    public static void main(String[] args) {
        AnimalProduct2 o=new AnimalProduct2();
        o.Animal("DESI COW");
        o.Animal1("MILK");

        System.out.println("---------------------------------------");
        AnimalProduct3 o2=new AnimalProduct3();
        o2.Animal("DESI COW");
        o2.Animal2(28);
    }
}
