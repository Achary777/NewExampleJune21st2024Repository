package com.sgtest.constructor.programonconstructorassgn;

class Interchange
{
    Interchange(int x[][])
    {
        int y[][]=new int [x.length][x[0].length];
        for(int i=0; i<x.length; i++)
        {
            for (int j=0; j<x[i].length; j++)
            {
                y[i][j]=x[j][i];
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }

    }
}
public class Transpose
{
    public static void main(String[] args)
    {
        Interchange trsp=new Interchange(new int[][]{{1, 1, 1},{2, 2, 2},{3, 3, 3}});

    }
}
