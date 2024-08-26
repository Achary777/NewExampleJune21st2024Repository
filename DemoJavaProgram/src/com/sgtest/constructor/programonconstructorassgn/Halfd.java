package com.sgtest.constructor.programonconstructorassgn;
class Halfoned
{
    Halfoned(int a[])
    {
        for(int i=a.length/2; i<a.length; i++)
        {
                 System.out.print(a[i]+" ");
        }
    }

}
public class Halfd
{
    public static void main(String[] args)
    {
        Halfoned hfd=new Halfoned(new int[]{10, 20 , 30 , 40, 50, 60, 70,});
    }
}
