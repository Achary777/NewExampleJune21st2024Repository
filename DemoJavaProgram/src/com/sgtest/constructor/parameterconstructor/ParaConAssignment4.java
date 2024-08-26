package com.sgtest.constructor.parameterconstructor;

class Newpaper
{
    String paperName;
    String lngType;
    String hOffice;
    int price;

    Newpaper(String paperName, String lngType, String hOffice, int price)
    {
        this.paperName=paperName;
        this.lngType=lngType;
        this.hOffice=hOffice;
        this.price=price;
        System.out.println("Name of Paper : "+paperName);
        System.out.println("Langauge : "+lngType);
        System.out.println("Head Office of Paper : "+hOffice);
        System.out.println("Price per Paper : "+price);
        System.out.println("-------------------------------------------------");

    }

}

class Magazine
{
    String magName;
    int lngType;
    String type;
    int price;

    Magazine(String magName, int lngType, String type, int price)
    {
        this.magName=magName;
        this.lngType=lngType;
        this.type=type;
        this.price=price;
        System.out.println("Magazine Name : "+magName);
        System.out.println("Langauge : "+lngType);
        System.out.println("Type of Magazine : "+type);
        System.out.println("Price per Magazine : "+price);
        System.out.println("-------------------------------------------------");

    }
}
class Comics
{
    String comName;
    String agegrp;
    String writerName;
    int price;

    Comics(String comName, String agegrp, String writerName, int price)
    {
        this.comName=comName;
        this.agegrp=agegrp;
        this.writerName=writerName;
        this.price=price;
        System.out.println("Comic book name : "+comName);
        System.out.println("Age group to read comics : "+agegrp);
        System.out.println("Comic book writer name : "+writerName);
        System.out.println("Comic price per book"+price);
    }

}
public class ParaConAssignment4
{
    public static void main(String[] args)
    {
        Newpaper nws=new Newpaper("Vijay Karnataka","Kannada","Bangaluru",5);
        Magazine mgz=new Magazine("Reader's Digest",21, "Monthly", 100);
        Comics com=new Comics("Marvel Comic","All","Stan Lee",100);
    }
}
