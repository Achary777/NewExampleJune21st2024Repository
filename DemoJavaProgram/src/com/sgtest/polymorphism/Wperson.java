package com.sgtest.polymorphism;


abstract class Woman
{
    abstract void mother();
}
class Sister extends Woman
{
    void mother()
    {
        System.out.println("Mother can be a SISTER");
    }
}
class Teacher extends Woman
{
    void mother()
    {
        System.out.println("Mother can be a Teacher");
    }
}
class Chef extends Woman {
    void mother() {
        System.out.println("Mother can be a Chef");
    }
}
public class Wperson
{
    public static void main(String[] args) {
        Woman w=null;
        Sister ws=new Sister();
        Teacher ww=new Teacher();
        Chef wm=new Chef();

       w=ws;
       w.mother();

       w=ww;
       w.mother();

       w=wm;
       w.mother();
    }
}
