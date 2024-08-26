package com.sgtest.constructor.assignNoArgs;

    class Customer1
    {
       String CustomerName;
       String Id;
       String location;
       int ContactNo;

       Customer1()
       {
           CustomerName="Shambu";
           Id="100241AB";
           location="Kailasa";
           ContactNo=100000000;
           System.out.println("Customer Name : "+CustomerName);
           System.out.println("Customer ID no : "+Id);
           System.out.println("Customer Location : "+location);
           System.out.println("Customer contact no : "+ContactNo);
           System.out.println("----------------------------------------");

       }
    }
    class Project1
    {
        String ProjectName;
        int AllotedPeriod;
        String complete;
        int Budget;

        Project1()
        {
            ProjectName="Plantation of Trees";
            AllotedPeriod=12;
            Budget=12500;
            complete="Inprogres";
            System.out.println("Project Name : "+ProjectName);
            System.out.println("No.s of Months : "+AllotedPeriod);
            System.out.println("Budget for Project in crore : "+Budget);
            System.out.println("Project upadate : "+complete);
            System.out.println("---------------------------------");
        }
    }
    class Task1
    {
        String TaskName;
        int NoOfworker;
        int NoOfTeams;
        int Completed;

        Task1()
        {
            TaskName="Oxygen generating trees";
            NoOfworker=150;
            NoOfTeams=15;
            Completed=70;
            System.out.println("Task name : "+TaskName);
            System.out.println("Total no of workers in task : "+NoOfworker);
            System.out.println("No of Teams Working : "+NoOfTeams);
            System.out.println("Percentage of work completed : "+Completed);
        }

    }
public class NoArgsConstructorCustomer
{
    public static void main(String[] args)
    {
        Customer1 cstmr=new Customer1();
        Project1 prj=new Project1();
        Task1 tsk=new Task1();

    }

}
