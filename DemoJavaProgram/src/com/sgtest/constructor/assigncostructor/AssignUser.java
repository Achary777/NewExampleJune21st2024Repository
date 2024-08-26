package com.sgtest.constructor.assigncostructor;

    class User
    {
        String UserName;
        String EmailId;
        int Id;
        int contact;
    }
    class Profile
    {
        String CurrentCompany;
        String PreviousCompany;
        int YearsOfExperience;
        int CTC;
    }
    class Role
    {
        String UserCurrentRole;
        String Responsibilities;
        String ReportingTo;
        int TeamSize;
    }


public class AssignUser {
        public static void main(String[] args)
        {
            User usr = new User();
                usr.UserName="Rajashankara";
                usr.EmailId="xyz@gmail.com";
                usr.Id=202412205;
                usr.contact = 987654321;
                System.out.println("Name of user : "+usr.UserName);
                System.out.println("E-mail ID of User : "+usr.EmailId);
                System.out.println("User ID No : "+usr.Id);
                System.out.println("User contact no : "+usr.contact);
                System.out.println("---------------------------");

            Profile prf = new Profile();
                prf.CurrentCompany="Namma Info Tech Ltd";
                prf.PreviousCompany="Prime Tecno Ltd";
                prf.YearsOfExperience=6;
                prf.CTC=12;
                System.out.println("Current company Name : "+prf.CurrentCompany);
                System.out.println("Previous Company Name : "+prf.PreviousCompany);
                System.out.println("No of work experience in years : "+prf.YearsOfExperience);
                System.out.println("Annual salary package in Lacs : "+prf.CTC);
                System.out.println("-----------------------------------");

            Role rls =new Role();
            rls.UserCurrentRole="General manager";
            rls.Responsibilities="Operating budgets, Developing strategy, Financial Management.. etc";
            rls.ReportingTo="CEO";
            rls.TeamSize=250;
            System.out.println("User current role : "+rls.UserCurrentRole);
            System.out.println("GM Roles & Responsibalities : "+rls.Responsibilities);
            System.out.println("GM is Reporting to : "+rls.ReportingTo);
            System.out.println("Teams size Under GM : "+rls.TeamSize);

        }
}
