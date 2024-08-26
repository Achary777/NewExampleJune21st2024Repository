package com.sgtest.methods.returnassignments;
class AdditionM
{
    int [][] getadditionofMatrix(int arr1[][], int arr2[][])
    {
        int arr3[][]=new int [arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++)
        {
          for(int j=0; j<arr1[i].length; j++)
          {
             arr3[i][j]=arr1[i][j] + arr2[i][j];
          }

        }
        return arr3;
    }
}
public class AddMatrix {
    public static void main(String[] args) {
        AdditionM m=new AdditionM();
        int x[][]={{35, 25, 55},{15, 65, 25}};
        int y[][]={{15, 25, 15},{25, 15, 25}};
        int result[][]=m.getadditionofMatrix(x,y);
        for(int[] i:result)
        {
            for(int k:i)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
