package com.sgtest.methods.assignments;

    //Q4: Write a method that method should display the count of even numbers in between 1 to 500 ?
class CountEvn
    {
        void even()
        {
            int count=0;
            for(int i=1; i<=500; i++)
            {
                if(i%2==0)
                {
                    count++;
                }
            }
            System.out.println("Count of Even numbers : "+count);
        }
    }
public class Assignment4 {
    public static void main(String[] args) {
        CountEvn ce=new CountEvn();
        ce.even();
    }
}
