package com.sgtest.polymorphism;

abstract class AnimalEats
{
    abstract void eat();

//    {
//        System.out.println("Animals Eat");
//    }
}
    class Herbivores extends AnimalEats
    {
        void eat()
        {
            System.out.println("Herbivores eat Plants");
        }
    }
    class Omnivores extends AnimalEats
    {
        void eat()
        {
            System.out.println("Omnivores Eat Plants and meat");
        }
    }
    class Carnivores extends AnimalEats
    {
        void eat()
        {
            System.out.println("Carnivores Eat meat");
        }
    }
public class AnimalDemo
{
    public static void main(String[] args) {
        AnimalEats Eats=null;
        Herbivores herbivores=new Herbivores();
        Omnivores omnivores=new Omnivores();
        Carnivores carnivores=new Carnivores();

        Eats=herbivores;
        Eats.eat();
        //herbivores.eat();
        Eats=omnivores;
        Eats.eat();

        Eats=carnivores;
        Eats.eat();
    }
}
