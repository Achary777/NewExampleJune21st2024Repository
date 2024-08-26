package com.sgtest.constructor.programonconstructorassgn;
class Freachloop
{
    Freachloop(int a[][])
    {
        int count=0;
        for (int b[]:a)
        {
            for (int kk : b)
            {
                count = count + 1;
                //System.out.println(kk);
            }
        }
        System.out.println(count);
    }

}
public class Feachloop
{
    public static void main(String[] args)
    {
        Freachloop fre=new Freachloop(new int[][]{{10, 20, 30},{40, 50, 60},{70, 80, 90}});
    }
}
