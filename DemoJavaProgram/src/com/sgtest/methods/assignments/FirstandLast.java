package com.sgtest.methods.assignments;
class FindFirstLast
{
    void FandL(int a[])
    {
        for(int i=0; i<a.length; i++)
            if((i==0) || (i==(a.length-1)))
            {
                System.out.println(a[i]+" ");
            }
    }
}

//For given only integer array display 1st & last elements ?
public class FirstandLast
{
    public static void main(String[] args) {
        FindFirstLast fl=new FindFirstLast();
        fl.FandL(new int[]{100,200,300});
    }
}
