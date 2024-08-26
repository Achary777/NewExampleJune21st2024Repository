package com.sgtest.constructor.overloading;
class Buyer
{
    Buyer(String Product, double price, long contact)
    {
        System.out.println("Product: "+Product);
        System.out.println("price: "+price);
        System.out.println("Phone Number: "+contact);
        System.out.println("---------------------------------");
    }

    Buyer(String buyerName,String item)
    {
        System.out.println("Buyer Name: "+buyerName);
        System.out.println("Product: "+item);
    }
}

public class Customer {

        public static void main(String[] args) {
            Buyer buy1=new Buyer("Shoes",900.45,251462589);
            Buyer buy2=new Buyer("Ravivarma","Shoes");

        }

}
