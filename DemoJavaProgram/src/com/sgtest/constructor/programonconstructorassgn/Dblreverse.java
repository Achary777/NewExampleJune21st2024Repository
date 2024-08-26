package com.sgtest.constructor.programonconstructorassgn;

class Dbreverse
{
    Dbreverse(double a[][])
    {
        for(int i=a.length-1; i>=0; i--)
        {
            for(int j=a[i].length-1; j>=0; j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
public class Dblreverse
{
    public static void main(String[] args)
    {
        Dbreverse dbr=new Dbreverse(new double[][]{{30.5, 40.5, 50.5},{60.5, 70.5, 80.5}});
    }
}
