package com.sgtest.methods.assignments;
class SecondHsum
{
    void Secondsum(int a[])
    {
        int sum=0;
        for(int j=a.length/2; j<a.length; j++)
            {
                sum=sum+a[j];

            }
        System.out.println(sum);
    }
}
public class SumHalf {
    public static void main(String[] args) {
        SecondHsum sh=new SecondHsum();
        sh.Secondsum(new int[]{10,20,30,40,50,60});
    }
}
