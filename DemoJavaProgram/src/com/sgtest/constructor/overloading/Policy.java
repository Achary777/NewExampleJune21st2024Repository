package com.sgtest.constructor.overloading;

class LifeInsurance
{
    LifeInsurance(String NameCompany,String InsurerName, long amount)
    {
        System.out.println("Isurence Company Name: "+NameCompany);
        System.out.println("Insurer Name: "+InsurerName);
        System.out.println("Insurence amont: "+amount);
        System.out.println("----------------------------------------------");
    }
    LifeInsurance(String Empname,String EmpId)
    {
        System.out.println("Employer Name: "+Empname);
        System.out.println("EmpId: "+EmpId);
    }
}

public class Policy {
    public static void main(String[] args) {
        LifeInsurance li=new LifeInsurance("AXIS Insurance","DRUVA",25000);
        LifeInsurance li1=new LifeInsurance("Sameer Sharma","1021AX21B21");
    }
}
