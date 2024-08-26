package com.sgtest.constructor.programonconstructorassgn;
class Strconcate
{
    Strconcate(String x[][])
    {
        String str=" ";
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x[i].length; j++)
            {
                if(j==i) ;
                {
                    str=x[i][j];
                    System.out.print(str);
                }
            }
        }
        System.out.println();
    }
}

public class StringCancat
{
    public static void main(String[] args)
    {
        Strconcate sc=new Strconcate(new String [][]{{"Rama","Sitha", "Rama"},{"Rama","Rama","Rama"},{"Jain","Shree", "Rama"}});
    }
}
