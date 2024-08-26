package com.sgtest.methods.returnassignments;

class FirstColumn
{
    int[] clmFirst(int[][] m)
    {
        int firstclm[]=new int[3];   //bcz its 3*3 array i.e [3]
       // int index=0;
        for(int i=0; i<3; i++)
        {
            firstclm[i]=m[i][0];

        }
       return firstclm;
    }
}
public class FirstC {
    public static void main(String[] args) {
        FirstColumn fc=new FirstColumn();
       int [][] q={{100,200,300},{1000,2000,3000},{10,20,30}};
        int [] F=fc.clmFirst(q);
       for (int i=0; i< F.length; i++)
       {
           System.out.println(F[i]+" ");

       }

    }
}
