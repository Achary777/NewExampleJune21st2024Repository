package com.sgtest.methods.returnassignments;

class Dish
{
    String[] getDishItems()
    {
        String s[]={"Palav","Idly","Upma"};
        return s;
    }
}
public class Food {
    public static void main(String[] args) {
        Dish o=new Dish();
        String dishes[]=o.getDishItems();
        //if we given print here we will get hexadecimal valu
        for (String val:dishes)                  //used For each Loop
        {
            System.out.print(val+" ");
        }
    }
}


