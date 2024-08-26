package com.sgtest.constructor.assigncostructor;

class Employee
    {
            String EmployeeName;
            String Gender;
            int id;
    }
    class Department
    {
        String DepartmentName;
        String DepartmentCode;
        int DepartmentFloorNo;
    }
    class Insurance
    {
        String InsuranceType;
        String InsuranceCover;
        int validyears;
    }
public class AssignEmployee

{
   public static void main(String[] args)
   {
        Employee obj3=new Employee();
        obj3.EmployeeName="Sagar Shreeram";
        obj3.id=10021;
        obj3.Gender="Male";
       System.out.println("Employee Name : "+obj3.EmployeeName);
       System.out.println("Employee id : "+obj3.Gender);
       System.out.println("Employee Gender : "+obj3.id);
       System.out.println("------------------------------");

       Department obj4=new Department();
       obj4.DepartmentName="Admin";
       obj4.DepartmentCode="100AD101";
       obj4.DepartmentFloorNo=3;
       System.out.println("Department Name : "+obj4.DepartmentName);
       System.out.println("Department Code : "+obj4.DepartmentCode);
       System.out.println("Department floor No : "+obj4.DepartmentFloorNo);
       System.out.println("----------------------------------------------");

       Insurance obj5=new Insurance();
       obj5.InsuranceType="Health";
       obj5.InsuranceCover="Family";
       obj5.validyears= 5;
       System.out.println("Insurance Type : "+obj5.InsuranceType);
       System.out.println("Insurance Covers to :"+obj5.InsuranceCover);
       System.out.println("Validity of Insurance years : "+obj5.validyears);



   }
}