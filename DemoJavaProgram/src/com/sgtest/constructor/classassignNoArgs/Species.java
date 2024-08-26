package com.sgtest.constructor.classassignNoArgs;

class Animal
{
    String aName;
    String aType;
    String fType;
    int available;

    Animal()
    {
        aName="Tiger";
        aType="Wild";
        fType="Native Habitat";
        available=3682;
        System.out.println("Name of Animal : "+aName);
        System.out.println("Type of Animal : "+aType);
        System.out.println("Foot type : "+fType);
        System.out.println("Papulation of India as per 2022 : "+available);
        System.out.println("------------------------------------------");
    }

}
class AquaticAnimal
{
    String aName;
    int aType;
    int wieght;
    String available;

    AquaticAnimal()
    {
        aName="Whale";
        aType=40;
        wieght=19;
        available="Atlantic";
        System.out.println("Name of Aquatic Animal :"+aName);
        System.out.println("No types in whales : "+aType);
        System.out.println("Approximate whales wiegth in Tons : "+wieght);
        System.out.println("Max Available in Region : "+available);

    }
}
public class Species
{
    public static void main(String[] args)
    {
        Animal anm=new Animal();
        AquaticAnimal aqu=new AquaticAnimal();
    }
}
