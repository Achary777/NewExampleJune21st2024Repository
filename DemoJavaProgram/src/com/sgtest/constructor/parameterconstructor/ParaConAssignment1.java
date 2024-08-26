package com.sgtest.constructor.parameterconstructor;

class University
{
    String universityName;
    String universityDeanName;
    String universitylocation;
    int noOfcollegesReg;

    University (String universityName,String universityDeanName,String universitylocation,int noOfcollegesReg)
    {
        this.universityName=universityName;
        this.universityDeanName=universityDeanName;
        this.universitylocation=universitylocation;
        this.noOfcollegesReg=noOfcollegesReg;
        System.out.println("Name of University : "+universityName);
        System.out.println("University DEAN name : "+universityDeanName);
        System.out.println("Location of University : "+universitylocation);
        System.out.println("No of Colleges reg under this University : "+noOfcollegesReg);
        System.out.println("-------------------------------------------------");
    }
}
class College
{
    String collegeName;
    String collegeDeanName;
    String collegeLocation;
    String Tyepeofcollege;

    College(String collegeName, String collegeDeanName, String collegeLocation, String tyepeofcollege)
    {
        this.collegeName=collegeName;
        this.collegeDeanName=collegeDeanName;
        this.collegeLocation=collegeLocation;
        this.Tyepeofcollege=tyepeofcollege;
        System.out.println("Name of college : "+collegeName);
        System.out.println("College DEAN name : "+collegeDeanName);
        System.out.println("Location of college : "+collegeLocation);
        System.out.println("Type of College : "+tyepeofcollege);
        System.out.println("-------------------------------------------------");
    }
}
class Student
{
    String studentName;
    String studentId;
    int studyingSem;
    int noOFbacklogs;

    Student(String studentName, String studentId, int studyingSem, int noOFbacklogs)
    {
        this.studentName=studentName;
        this.studentId=studentId;
        this.studyingSem=studyingSem;
        this.noOFbacklogs=noOFbacklogs;
        System.out.println("Name of Student : "+studentName);
        System.out.println("Student ID no : "+studentId);
        System.out.println("Present Semister : "+studyingSem);
        System.out.println("No of BlackLogs : "+noOFbacklogs);
    }
}


public class ParaConAssignment1 {
    public static void main(String[] args) {
        University obj1 = new University("Visvesvaraya Technological University", "Dr.Vidyashankar", "Belagavi", 185);
        College obj2 = new College("AMC Engineering College", "Dr.Ambreesh", "Bannerghatta", "Affiliated by VTU");
        Student obj3 = new Student("Manohar", "1Am110ME043", 8, 0);
    }
}