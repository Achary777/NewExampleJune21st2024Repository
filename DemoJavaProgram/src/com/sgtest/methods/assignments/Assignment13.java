package com.sgtest.methods.assignments;

    //Q13: Write a method to display count of numbers in btw 200 to 400 divisible by 2, 4, 6 ?

class Demo12
{
    void num()
    {
        int count=0;
        for(int i=200;i<=400;i++)
        {
            if((i%2==0)&&(i%4==0)&&(i%6==0))
            {
                count++;
            }
        }
        System.out.println("Count of number Divisible by 2,4,6 :"+count);
    }
}

public class Assignment13 {
    public static void main(String[] args) {
        Demo12 o1 = new Demo12();
        o1.num();
    }
}
