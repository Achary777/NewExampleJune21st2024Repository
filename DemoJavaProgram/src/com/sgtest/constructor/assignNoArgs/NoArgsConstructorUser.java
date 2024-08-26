package com.sgtest.constructor.assignNoArgs;

    class User1
    {
        String UserName;
        String EmailId;
        int Id;
        int contact;

        User1()
        {
            UserName="Rajashankara";
            EmailId="xyz@gmail.com";
            Id=202412205;
            contact = 987654321;
            System.out.println("Name of user : "+UserName);
            System.out.println("E-mail ID of User : "+EmailId);
            System.out.println("User ID No : "+Id);
            System.out.println("User contact no : "+contact);
            System.out.println("---------------------------");
        }
    }
    class Profile1
    {
        String CurrentCompany;
        String PreviousCompany;
        int YearsOfExperience;
        int CTC;

        Profile1()
        {
            CurrentCompany="Namma Info Tech Ltd";
            PreviousCompany="Prime Tecno Ltd";
            YearsOfExperience=6;
            CTC=12;
            System.out.println("Current company Name : "+CurrentCompany);
            System.out.println("Previous Company Name : "+PreviousCompany);
            System.out.println("No of work experience in years : "+YearsOfExperience);
            System.out.println("Annual salary package in Lacs : "+CTC);
            System.out.println("-----------------------------------");
        }
    }
    class Role1
    {
        String UserCurrentRole;
        String Responsibilities;
        String ReportingTo;
        int TeamSize;

        Role1()
        {
            UserCurrentRole="General manager";
            Responsibilities="Operating budgets, Developing strategy, Financial Management.. etc";
            ReportingTo="CEO";
            TeamSize=250;
            System.out.println("User current role : "+UserCurrentRole);
            System.out.println("GM Roles & Responsibalities : "+Responsibilities);
            System.out.println("GM is Reporting to : "+ReportingTo);
            System.out.println("Teams size Under GM : "+TeamSize);
        }
    }


public class NoArgsConstructorUser
{
        public static void main(String[] args)
        {
            User1 usr = new User1();

            Profile1 prf = new Profile1();

            Role1 rls =new Role1();


        }
}
