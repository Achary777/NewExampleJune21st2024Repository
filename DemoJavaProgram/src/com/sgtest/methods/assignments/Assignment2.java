package com.sgtest.methods.assignments;

    //Q2: Write method that method as to display sum of square of each number in between 1 to 10 ?

class SumSqr
{
    void sumSquare()
    {
        {
            int sqr = 0;
            int sum=0;
            for (int i = 1; i <= 10; i++)
            {
                sqr = i * i;
              //  System.out.println("Square of each no : "+sqr);

                sum = sum + sqr;
                System.out.println("Sum of square of each number : "+sum);
            }
        }
    }

}


public class Assignment2 {
    public static void main(String[] args) {
        SumSqr ss=new SumSqr();
        ss.sumSquare();

    }
}
