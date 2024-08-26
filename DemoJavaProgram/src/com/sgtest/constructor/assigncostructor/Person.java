package com.sgtest.constructor.assigncostructor;

public class Person
{
    String firstName;
    int age;
    public static void main(String[] age)
    {
        Person obj1=new Person();
        obj1.firstName= "Virat Kohli";
        obj1.age = 42;
        System.out.println("First name :"+obj1.firstName);
        System.out.println("Age : "+obj1.age);
        System.out.println("******************");

        Person obj2 = new Person();
        obj2.firstName="Shree Rama";
        obj2.age=00;
        System.out.println("First name : "+obj2.firstName);
        System.out.println("Age : "+obj2.age);
     }

}
