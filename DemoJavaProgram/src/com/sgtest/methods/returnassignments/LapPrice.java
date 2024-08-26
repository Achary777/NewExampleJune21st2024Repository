package com.sgtest.methods.returnassignments;


class LaptopCost
{
    double LapCost(double amount)
    {
        return amount;
    }
}
public class LapPrice {
    public static void main(String[] args) {
        LaptopCost o=new LaptopCost();
        double v1=o.LapCost(25000);
        System.out.println("Laptop cost : "+v1);
    }
}
