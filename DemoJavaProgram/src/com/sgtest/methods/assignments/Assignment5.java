package com.sgtest.methods.assignments;

    //Q5: Write a method for given byte array assign each element, element into integer & display integer array ?

class CastBt
{
    void castbyte_int(byte a[])
    {
        int b[]=new int[a.length];
        int index=0;
        for(int i=0; i<a.length; i++)
        {
            b[index]=a[i];
            System.out.println(b[index]);
        }
    }
}
public class Assignment5 {
    public static void main(String[] args) {
        CastBt cbi=new CastBt();
        cbi.castbyte_int(new byte[]{50,40,30,20,10});
    }
}
