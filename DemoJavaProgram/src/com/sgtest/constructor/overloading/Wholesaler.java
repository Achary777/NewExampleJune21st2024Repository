package com.sgtest.constructor.overloading;
class  Wholesale
{
    Wholesale(String wsName, String loc, String items, int contact)
    {
        System.out.println("Wholesaler Name : "+wsName);
        System.out.println("Loaction : "+loc);
        System.out.println("Whole sale Items : "+items);
        System.out.println("Contact Details : "+contact);
    }
    Wholesale(double minprice, double maxprice, double quantity)
    {
        System.out.println("Min price start at :"+minprice);
        System.out.println("Max price at : "+maxprice);
        System.out.println("Min Quantity should buy : "+quantity);
    }
}
public class Wholesaler {
    public static void main(String[] args) {
        Wholesale wsl=new Wholesale("Ram Arts Material", "Bangaluru" ,"All type art materials",984508718);
        Wholesale wsl1=new Wholesale(5.00,25000.00,10);
    }
}
