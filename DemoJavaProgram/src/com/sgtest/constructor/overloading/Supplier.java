package com.sgtest.constructor.overloading;

class Provider
    {
        Provider(String prdName,String prdid,int Quantity)
    {
        System.out.println("Provider Name: "+prdName);
        System.out.println("Provider id: "+prdid);
        System.out.println("Quantity: "+Quantity);
        System.out.println("----------------------------");
    }
        Provider(String prdto,int Quantity,int QualityType)
    {
        System.out.println("Supplying to: "+prdto);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Quality Type: "+QualityType);
    }
}
public class Supplier {
    public static void main(String[] args) {
        Provider prd1=new Provider("Eyer Rings","G12K",25);
        Provider prd2=new Provider("Varalakshmi",25,916);
    }

}
