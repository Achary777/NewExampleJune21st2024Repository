package com.sgtest.methods.returnassignments;

class SecHalf
{
    double[] halfSec (double[] a)
    {
        double[] hs=new double[a.length];
        return a;
    }
}
public class Secondhalf {
    public static void main(String[] args) {
        SecHalf sh=new SecHalf();
       double[] o= sh.halfSec(new double[]{10.25,20.35,30.45,40.55,50.65,60.75});
        for (int i= o.length/2; i< o.length; i++)
        {
            System.out.print(o[i]+" ");
        }
    }
}
