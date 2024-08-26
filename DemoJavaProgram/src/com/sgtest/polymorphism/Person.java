package com.sgtest.polymorphism;

abstract class Men
{
    abstract void man();
}
class Brother extends Men
{
    void man()
    {
        System.out.println("A man can be a BROTHER");
    }
}
class Husband extends Men
{
    void man()
    {
        System.out.println("A MAN can be a HUSBAND");
    }
}
class Father extends Men
{
    void man()
    {
        System.out.println("A MAN can be a FATHER");
    }
}
public class Person
{
    public static void main(String[] args) {
        Men m=null;
        Brother bm=new Brother();
        Husband hm=new Husband();
        Father fm=new Father();

        m=bm;
        m.man();

        m=hm;
        m.man();

        m=fm;
        m.man();
    }
}
