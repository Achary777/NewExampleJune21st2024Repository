package com.sgtest.methods.returnassignments;
class Demo1
{
    String collegeName(String cllgname)
    {
        return cllgname;
    }
}
public class Collegename {
    public static void main(String[] args) {
        Demo1 o=new Demo1();
        String v1=o.collegeName("AMC ENGINEERING COLLEGE, BANGALORE");
        System.out.println("Name of college : "+v1);
    }
}
