package com.sgtest.constructor.programonconstructorassgn;

class Bsum
{
    Bsum(byte a[][])
    {
        int sum=0;
        for (int i = 0; i < a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                sum=sum+a[i][j];

            }
        }
        System.out.print("Sum of all the elements : "+sum);
    }
}
public class Btsum
{
    public static void main(String[] args)
    {
        Bsum btsum=new Bsum(new byte[][]{{10, 20, 30},
                                         {20, 30, 40},
                                         {30, 40, 50}});
    }
}
