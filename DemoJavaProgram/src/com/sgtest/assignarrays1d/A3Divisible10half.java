package com.sgtest.assignarrays1d;

public class A3Divisible10half
{
    public static void main(String[] args)
    {
        int count=0;
        for (int i =100; i<=300; i++)
        {
            if(i%10==0)
            {
                count=count+1;
            }

        }
        System.out.println("No of counts which are divisible by 10 : "+count);
        System.out.println("*****************************");

      int[] number =new int[count];
      //  int [] m={200,210,220,230,231,240,250,260,270,280,290};
         int temp=0;
        for(int j=100; j<=300; j++)
        {
            System.out.println(" j : "+j);
            if(j%10==0)
            {
               // a[k] = j;
                number[temp]=j;
                temp = temp + 1;
                System.out.println("j : "+j);
                System.out.println("number: "+number);
                System.out.println("temp: "+temp);
                System.out.println("------------------------------- ");
            }
        }

        for(int z=number.length/2; z<number.length; z++)
      //  for(int z=m.length/2; z<m.length; z++)
        {
            System.out.print(number[z]+" ");
        }
    }

}
