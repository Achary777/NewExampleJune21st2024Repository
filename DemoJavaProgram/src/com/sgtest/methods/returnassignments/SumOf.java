package com.sgtest.methods.returnassignments;

class SumShort{
    short sumAll(short [][]g)
    {
        short sum=0;
        for (int i=0; i<g.length; i++)
        {
            for (int j=0; j<g[i].length; j++)
            {
                sum+=g[i][j];
            }
        }
        return sum;
    }
}
public class SumOf {
    public static void main(String[] args) {
        SumShort sm=new SumShort();
        short g =sm.sumAll(new short[][]{{25,35,45},{10,30,60}});
        System.out.println(g);
    }
}
