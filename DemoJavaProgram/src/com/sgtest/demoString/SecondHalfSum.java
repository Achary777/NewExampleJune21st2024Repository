package com.sgtest.demoString;
class SecondHsum
{
    void Secondsum(int a[])
    {
        int sum=0;
        for(int j=a.length/2; j<a.length; j++)
        {
            sum=sum+a[j];

        }
        System.out.println("Second half sum"+sum);
    }
}
public class SecondHalfSum  {
    public static void main(String[] args) {
        SecondHsum sh=new SecondHsum();
        sh.Secondsum(new int[]{10,20,30,40,50,60});

    }
}


