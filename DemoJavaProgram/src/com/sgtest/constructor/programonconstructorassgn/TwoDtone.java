package com.sgtest.constructor.programonconstructorassgn;
class Convertto1D
{
   Convertto1D(int arr[][])
    {
        int row= arr.length;
        int colm=arr[0].length;

        int oneDArr[]=new int[row * colm];
        int index=0;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<colm; j++)
            {
                oneDArr[index]=arr[i][j];         //oneDArr[0]=arr[0][0];
                index++;
            }
        }
        for (int kk:oneDArr)                    //For each Loop used
        {
            System.out.print(kk+" ");
        }
        System.out.println();
    }
}
public class TwoDtone
{
    public static void main(String[] args)
    {
        Convertto1D oneD =new Convertto1D(new int[][]{{10, 20, 30},{100, 200, 300},{1000, 2000, 3000}});
    }
}
