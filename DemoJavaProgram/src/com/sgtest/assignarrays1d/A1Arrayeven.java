package com.sgtest.assignarrays1d;

public class A1Arrayeven
{
    public static void main(String[] args)
    {
        int count=0;
        for(int i=100; i>=50; i--)
        {
            if (i % 2 == 0) {

                count = count + 1;
            }
        }
        System.out.println("Even numbers count: "+count);
        System.out.println("****************************");


        int[] a= new int[count];
        int k=0;
        for(int j=100; j>=50; j--)
        {
            if(j%2==0)
            {
                a[k] = j;
                k = k + 1;
            }
        }
       for(int z=a.length-1; z >=0; z--)
       {
           System.out.println(a[z]);
       }
    }
}
