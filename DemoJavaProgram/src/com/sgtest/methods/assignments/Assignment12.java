package com.sgtest.methods.assignments;

    //Q12: Write a method the method as to display  for given 4*4 2D int array & display 3rd & 4th row of elements ?

class Demo11
{
    void int_3_4(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            if((i==a.length-2)||(i==(a.length-1)))
            {
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}


public class Assignment12 {
    public static void main(String[] args) {
        System.out.println("Third and Fourth Row of 2D Array :");
        Demo11 o1 = new Demo11();
        o1.int_3_4(new int[][]{{100, 200, 300, 400},
                {500, 600, 700, 800},
                {900, 1000, 2000, 3000},
                {4000, 5000, 6000, 7000}});
    }
}
