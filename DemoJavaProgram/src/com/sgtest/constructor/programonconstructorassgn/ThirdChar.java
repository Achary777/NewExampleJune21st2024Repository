package com.sgtest.constructor.programonconstructorassgn;
class Threechar
{
    Threechar(char c[][])
    {
        char str=' ';
        for(int i=0; i<c.length; i++)
        {
            for(int j=0; j<c[i].length; j++)
            {
                if(j==c[i].length-1)
                {
                    str=c[i][j];
                    System.out.print(str);
                }
            }

        }
        System.out.println();
    }
}
public class ThirdChar
{
    public static void main(String[] args)
    {
        Threechar tchar=new Threechar(new char[][]{{'A','B','C'},{'D','E','F'},{'G','H','I'}});
    }
}
