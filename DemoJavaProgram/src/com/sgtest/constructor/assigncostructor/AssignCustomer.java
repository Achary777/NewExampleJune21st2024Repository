package com.sgtest.constructor.assigncostructor;

    class Customer
    {
       String CustomerName;
       String Id;
       String location;
       int ContactNo;
    }
    class Project
    {
        String ProjectName;
        int AllotedPeriod;
        String complete;
        int Budget;
    }
    class Task
    {
        String TaskName;
        int NoOfworker;
        int NoOfTeams;
        int Completed;

    }
public class AssignCustomer
{
    public static void main(String[] args)
    {
        Customer cstmr=new Customer();
            cstmr.CustomerName="Shambu";
            cstmr.Id="100241AB";
            cstmr.location="Kailasa";
            cstmr.ContactNo=100000000;
            System.out.println("Customer Name : "+cstmr.CustomerName);
            System.out.println("Customer ID no : "+cstmr.Id);
            System.out.println("Customer Location : "+cstmr.location);
            System.out.println("Customer contact no : "+cstmr.ContactNo);
            System.out.println("----------------------------------------");

        Project prj=new Project();
            prj.ProjectName="Plantation of Trees";
            prj.AllotedPeriod=12;
            prj.Budget=12500;
            prj.complete="Inprogres";
            System.out.println("Project Name : "+prj.ProjectName);
            System.out.println("No.s of Months : "+prj.AllotedPeriod);
            System.out.println("Budget for Project in crore : "+prj.Budget);
            System.out.println("Project upadate : "+prj.complete);
            System.out.println("---------------------------------");

        Task tsk=new Task();
        tsk.TaskName="Oxygen generating trees";
        tsk.NoOfworker=150;
        tsk.NoOfTeams=15;
        tsk.Completed=70;
        System.out.println("Task name : "+tsk.TaskName);
        System.out.println("Total no of workers in task : "+tsk.NoOfworker);
        System.out.println("No of Teams Working : "+tsk.NoOfTeams);
        System.out.println("Percentage of work completed : "+tsk.Completed);
    }

}
