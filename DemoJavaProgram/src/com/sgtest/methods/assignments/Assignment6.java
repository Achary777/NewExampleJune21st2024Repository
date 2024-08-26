package com.sgtest.methods.assignments;

    //Q6: For given double 2d 3*3 array assign each element into integer array & read int array ?

class CastDouble_int
{
    void castdouble_int(double a[][])
    {
        int b[][]=new int[a.length][a[0].length];
        int index1=0;
        int index2=0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                b[index1][index2]=(int) a[i][j];
                System.out.print(b[index1][index2]+" ");
            }
            System.out.println();
        }
    }
}
public class Assignment6 {
    public static void main(String[] args) {
        CastDouble_int cd=new CastDouble_int();
        cd.castdouble_int(new double[][]{{100.5,200.5,300.5},{400.25,500.25,600.25},{700.35,800.35,900.35}});
    }
}
