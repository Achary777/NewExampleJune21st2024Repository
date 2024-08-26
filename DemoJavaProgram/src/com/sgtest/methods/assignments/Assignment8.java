package com.sgtest.methods.assignments;

    //Q8: Write a program to display prime numbers in btw 1 to 50 ?

class PrimeNo
{
    void pnumber()
    {
        int num=50;
        int d;
        for (int i=1; i<=num; i++)
        {
            d=0;
            for (int j=2; j<i/2; j++)
            {
                if (i%j==0)
                {
                    d++;
                    break;
                }
            }
            if(d==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
public class Assignment8 {
    public static void main(String[] args) {
        PrimeNo pn=new PrimeNo();
        System.out.println("Prime no.s from 1 to 50");
        pn.pnumber();
    }
}
