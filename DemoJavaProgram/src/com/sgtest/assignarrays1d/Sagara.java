package com.sgtest.assignarrays1d;

public class Sagara
{
    public static void main(String[] args) {

     Sagara o=new Sagara();
//        o.maths();
//        sub();
        System.out.println(o.division());
        System.out.println(name());
    }

    void maths()
    {
        int a=12, b=10;
        int res=a+b;
        System.out.println(res);

    }

    static void sub()
    {
        int a=12, b=10;
        int res=a-b;
        System.out.println(res);
    }

    public int division()
    {
        int a=12, b=10;
        int res=a/b;
//        System.out.println(res);
        return res;
    }
    public static String name()
    {
        String f="Manohar";
        int a=10;
        return null;
    }


}
