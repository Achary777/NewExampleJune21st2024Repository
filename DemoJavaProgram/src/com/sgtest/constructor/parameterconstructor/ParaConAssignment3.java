package com.sgtest.constructor.parameterconstructor;
class Wholesaler
{
    String wsName;
    String wsType;
    String minQuatity;
    int mrkCap;

    Wholesaler(String wsName, String wsType, String minQuatity, int mrkCap)
    {
        this.wsName=wsName;
        this.wsType=wsType;
        this.minQuatity=minQuatity;
        this.mrkCap=mrkCap;
        System.out.println("WholSaler Name : "+wsName);
        System.out.println("Wholesaler type : "+wsType);
        System.out.println("Min quatity should purchase :"+minQuatity);
        System.out.println("Wholesaler market Cap in croer : "+mrkCap);
        System.out.println("-------------------------------------------------");
    }

}
class Retailer
{
    String rtrName;
    String prdType;
    int stock;
    int noOfOrder;

    Retailer(String rtrName, String prdType, int stock, int noOfOrder)
    {
        this.rtrName=rtrName;
        this.prdType=prdType;
        this.stock=stock;
        this.noOfOrder=noOfOrder;
        System.out.println("Retailer Name : "+rtrName);
        System.out.println("Product Type : "+prdType);
        System.out.println("Stock availabel in Tons : "+stock);
        System.out.println("No orders : "+noOfOrder);
        System.out.println("-------------------------------------------------");
    }
}
class Purchaser
{
    String pchsName;
    String itemsName;
    int noOfitems;
    int price;

    Purchaser(String pchsName, String itemsName, int noOfitems, int price)
    {
        this.pchsName=pchsName;
        this.itemsName=itemsName;
        this.noOfitems=noOfitems;
        this.price=price;
        System.out.println("Purchaser Name : "+pchsName);
        System.out.println("Purchased items list : "+itemsName);
        System.out.println("No of Items purchased : "+noOfitems);
        System.out.println("Total price of purchased items : "+price);
    }
}

public class ParaConAssignment3
{
    public static void main(String[] args)
    {
        Wholesaler ws=new Wholesaler("Kandelwal Clothes private ltd", "All type of Clothes","100pcs",15);
        Retailer rtr=new Retailer("Karuna Automobiles","Car Wheels",100, 25);
        Purchaser psr=new Purchaser("Vishnu","i20 car Wheels", 4,25000);
    }
}
