package com.sgtest.demoString;
class BasicMaths
{
    int getFactorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return  num*getFactorial(num-1);
    }
}
public class MainDemo2 {
    public static void main(String[] args) {
        BasicMaths o=new BasicMaths();
        int f1=o.getFactorial(5);
        System.out.println("Factorial number of 5 :"+f1);

        System.out.println("-------------------------");
        int f2=o.getFactorial(7);
        System.out.println("Factorial number of 7 :"+f2);
    }
}
