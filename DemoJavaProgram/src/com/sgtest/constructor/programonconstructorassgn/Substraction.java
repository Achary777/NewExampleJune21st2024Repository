package com.sgtest.constructor.programonconstructorassgn;
class Submaths
{
    Submaths(int x[][], int y[][])
    {
        for(int i=0; i<x.length; i++)
        {
            for (int j=0; j<x[i].length; j++)
            {
                int res=(x[i][j]-y[i][j]);
                System.out.print(res+" ");
            }
            System.out.println();
        }

    }
}
public class Substraction
{
    public static void main(String[] args)
    {
        int a[][]={{60,40, 30},{70, 50, 20}};
        int b[][]={{5, 3, 1},{3, 4, 1}};
        Submaths O1=new Submaths(a,b);
    }
}
