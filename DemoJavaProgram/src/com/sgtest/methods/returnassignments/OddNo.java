package com.sgtest.methods.returnassignments;

class OddNo10to1
{
    int [] oddnumber()
    {
        int a[] ={9,7,5,3,1};
        return a;
    }
}
public class OddNo {
    public static void main(String[] args) {
        OddNo10to1 od=new OddNo10to1();
        int[] odn=od.oddnumber();
        for (int b:odn)
        {
            System.out.println(b);
        }

    }
}
