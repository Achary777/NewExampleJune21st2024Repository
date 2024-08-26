package com.sgtest.methods.returnassignments;

class DArray
{
    double[][] double_2darray(double[][] arr)
    {
        double[][] dd=new double[arr.length][0];
        return dd;
    }
}
public class DbleD {
    public static void main(String[] args) {
        DArray o1=new DArray();
        double [][] a=new double[][]{{10.1,10.2,10.3},{20.1,20.2,20.3},{30.1,30.2,30.3}};
        for (double [] val:a)
        {
            for (double val2:val)
            {
                System.out.print(val2+" ");
            }
            System.out.println();
        }

    }
}
