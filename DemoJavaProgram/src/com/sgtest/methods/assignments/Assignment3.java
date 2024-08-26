package com.sgtest.methods.assignments;

    //Q3: For given 2D double array display the 1st row of the elements in Reverse order ?

class DoubleRevers
{
    void dblReverse(double arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            if(i==0)
            {
                for (int j = arr[i].length - 1; j >= 0; j--)
                {

                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        DoubleRevers dbr=new DoubleRevers();
        dbr.dblReverse(new double[][]{{10.51,20.51,30.51}, //this row should print reverse ie 30.51 20.51 10.51
                                      {40.51,50.51,60.51},
                                      {70.51,80.51,90.51}});
    }
}
