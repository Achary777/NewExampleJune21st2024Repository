package com.sgtest.methods.assignments;
class FirstSumSecondSum
{

    void Firstsum(int a[])
    {
        {
            int first = 0;
            for (int i = 0; i < a.length / 2; i++)
            {
                first = first + a[i];
            }
            System.out.println("Fisrt half of sum :" + first);

            int sec = 0;
            for (int j = a.length / 2; j < a.length; j++)
            {
                sec = sec + a[j];

            }
            System.out.println("Second half of sum :" + sec);
            System.out.println("Addition of first & second half : "+(first+sec));

        }

    }
}
public class FirstsumAndSecondSum {
    public static void main(String[] args) {
        FirstSumSecondSum fs=new FirstSumSecondSum();
        fs.Firstsum(new int[]{10,20,30,40,50,60});

    }
}
