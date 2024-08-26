package com.sgtest.constructor.parameterconstructor;
class Shop
{
    String shopName;
    String shopType;
    int noOfWorkers;
    int annualProfit;

    Shop(String shopName, String shopType, int noOfWorkers, int annualProfit)
    {
        this.shopName=shopName;
        this.shopType=shopType;
        this.noOfWorkers=noOfWorkers;
        this.annualProfit=annualProfit;
        System.out.println("Name of Shop : "+shopName);
        System.out.println("Type of shop : "+shopType);
        System.out.println("No of workers : "+noOfWorkers);
        System.out.println("Annual Profit in lacs : "+annualProfit);
        System.out.println("-------------------------------------------------");
    }
}
class Purchase
{
    String purchaseName;
    String purchaseType;
    int items;
    int price;

    Purchase(String purchaseName, String purchaseType, int items, int price)
    {
        this.purchaseName=purchaseName;
        this.purchaseType=purchaseType;
        this.items=items;
        this.price=price;
        System.out.println("Name of purchaser : "+purchaseName);
        System.out.println("Type of purchase : "+purchaseType);
        System.out.println("No of items purchased : "+items);
        System.out.println("Total amount of items : "+price);
        System.out.println("-------------------------------------------------");
    }
}
class Distributer
{
    String distrName;
    String distrType;
    int noOfretailer;
    int annualProf;

    Distributer(String distrName, String distrType, int noOfretailer, int annualProf)
    {
        this.distrName=distrName;
        this.distrType=distrType;
        this.noOfretailer=noOfretailer;
        this.annualProf=annualProf;
        System.out.println("Name of Distributer : "+distrName);
        System.out.println("Type of distributer : "+distrType);
        System.out.println("No of shop to distributing : "+noOfretailer);
        System.out.println("Annual Profits Crore : "+annualProf);
    }
}
public class ParaConAssignment2
{
    public static void main(String[] args)
    {
        Shop sp=new Shop("Vaidya Medical","Parmacy",5,25);
        Purchase rtr=new Purchase("Srini", "Cash",10,2500);
        Distributer dstr=new Distributer("SVC Private ltd","Medical Equipments",2500, 25);
    }
}
