package com.sgtest.constructor.overloading;

class Product
{
    Product(String pName, String modelType, double price)
    {
        System.out.println("Product Name : "+pName);
        System.out.println("Product Model type : "+modelType);
        System.out.println("On road price in lacs : "+price);
    }
    Product(String mileage, int noOfservices, int noOfAirbags)
    {
        System.out.println("mileage : "+mileage);
        System.out.println("No of Serivices per Year : "+noOfservices);
        System.out.println("No of Airbags Available : "+noOfAirbags);
    }
};

public class Products {
    public static void main(String[] args) {

        Product p1=new Product("Tata Nexon Car","High End",15.6);
        Product p2=new Product("27pl",3,6);
    }
}
