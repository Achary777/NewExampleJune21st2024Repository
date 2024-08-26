package com.sgtest.methods.returnassignments;

class Prime
{
    boolean isPrime(int num)
    {
        boolean prime=true;
        for (int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        return prime;
    }
}

public class DemoPrime {
    public static void main(String[] args) {
        Prime o=new Prime();
        boolean val1=o.isPrime(13);
        System.out.println("Is Prime number : "+val1);
        System.out.println("----------------------------");

    //Print Prime no's in btw 1 to 50 ?
        for (int i=1; i<=50; i++)
        {
            if (o.isPrime(i)==true)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");

    //Print Prime no's 200 to 100 ?
        int f=0;
        for (int i=200; i>=100; i--)
        {
            if (o.isPrime(i)==true)
            {
                {
                    f++;
                }
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("Count of prime no's from 200 to 100 : "+f);
        System.out.println("------------------------------");

    //Count of Prime number in btw 1 to 100 ?
        int count=0;
        for (int i=2; i<=100; i++)
        {
            if (o.isPrime(i)==true)
            {
                count++;  //count=count+1;
            }
        }
        System.out.println("Prime no's count from 1 to 100 : "+count);
    }
}
