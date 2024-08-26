package com.sgtest.methods.assignments;

    //Q9: Write a method to display count of Prime Numbers in btw 1 to 100 ?


class PrimeNo1
{
    void pnumber1()
    {
        int num=100;
        int d;
        int count=0;
        for (int i=2; i<=num; i++)
        {
            d=0;
            for (int j=2; j<=i/2; j++)
            {
                if (i%j==0)
                {
                    d++;
                    break;
                }
            }
            if(d==0)
            {
                count++;
            }
        }
        System.out.println("Count of Prime Numbers : "+count);
    }
}
public class Assignment9 {
    public static void main(String[] args) {
        PrimeNo1 ptn=new PrimeNo1();
        ptn.pnumber1();
    }
}
