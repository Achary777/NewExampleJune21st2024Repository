package com.sgtest.methods.assignments;

class Factorial
{
    //Q : Write a method find the factorial of a given number ?
    void FactFind(int a)
    {
        int f=1;
        for (int i=a; i>1; i--)
        {
            f=f*i;
        }
        System.out.println("Factorial of given number : "+f);
    }
}
public class FactorialAssign {
    public static void main(String[] args) {
        Factorial ft=new Factorial();
        ft.FactFind (5);
        ft.FactFind(7);
        ft.FactFind(9);
    }
}
