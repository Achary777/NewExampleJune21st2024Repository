package com.sgtest.constructor.assignNoArgs;
    class Employee2 {
        String EmployeeName;
        String Gender;
        int id;

        Employee2() {
            EmployeeName = "Sagar Shreeram";
            id = 10021;
            Gender = "Male";
            System.out.println("Employee Name : " + EmployeeName);
            System.out.println("Employee id : " + Gender);
            System.out.println("Employee Gender : " + id);
            System.out.println("------------------------------");
        }
    }
    class Department2
    {
        String DepartmentName;
        String DepartmentCode;
        int DepartmentFloorNo;

        Department2()
        {
            DepartmentName="Admin";
            DepartmentCode="100AD101";
            DepartmentFloorNo=3;
           System.out.println("Department Name : "+DepartmentName);
           System.out.println("Department Code : "+DepartmentCode);
           System.out.println("Department floor No : "+DepartmentFloorNo);
           System.out.println("----------------------------------------------");

        }

    }
    class Insurance2
    {
        String InsuranceType;
        String InsuranceCover;
        int validyears;

        Insurance2()

        {
            InsuranceType = "Health";
            InsuranceCover = "Family";
            validyears = 5;
            System.out.println("Insurance Type : " +InsuranceType);
            System.out.println("Insurance Covers to :" +InsuranceCover);
            System.out.println("Validity of Insurance years : " +validyears);

        }
    }
public class EmployeeNoArgsConstructor
{
    public static void main(String[] args)
    {
        Employee2 obj3=new Employee2();
        Department2 obj4=new Department2();
        Insurance2 obj5 = new Insurance2();
    }

}
