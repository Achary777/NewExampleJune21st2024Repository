package com.sgtest.methods.assignments;

    //Q11: Write a method it as to diplay all 20  tables ?

class Tables
{
    void tablemath()
    {
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=10;j++)
            {
                String str=(i +"*"+j +"="+(i*j));
                System.out.println(str);
            }
            System.out.println("----------");
        }
    }
}
public class Assignment11 {
    public static void main(String[] args) {
        Tables o1=new Tables();
        o1.tablemath();
    }
}