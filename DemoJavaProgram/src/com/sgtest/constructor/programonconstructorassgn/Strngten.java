package com.sgtest.constructor.programonconstructorassgn;
class Firstsecnd
{
    Firstsecnd(String a[][])
    {
        // 1st & 2nd column
        String str=" ";

            for(int j=0; j<a.length; j++)
            {
                if (a[j].length==3)             //or if(a[i].length==3)               //a[i].lenghth is total length of array i.e 3

                {
                    str=a[j][0]+" "+a[j][1];
                    System.out.print(str);
                }
                System.out.println();
            }


    }
}
public class Strngten
{
    public static void main(String[] args)
    {
        Firstsecnd fs=new Firstsecnd(new String[][]{{"Vishnu", "Lakshmi", "Garuda"},
                                                    {"Rama", "Sitha", "Hanuman"},
                                                    {"Krishna", "Radha", "Rukmini"}});
    }
}
