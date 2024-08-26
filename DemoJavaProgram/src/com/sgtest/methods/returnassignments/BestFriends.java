package com.sgtest.methods.returnassignments;

       class BfrndsName
        {
            String[] getBestfriendsName()
            {
                String bestf[]={"Rama","Krishna","Shiva"};
                return bestf;
            }
        }

public class BestFriends{
    public static void main(String[] args) {
    BfrndsName bfn=new BfrndsName();
        String[] names =bfn.getBestfriendsName();
        //if we given print here we will het hexadecimal valu
        for (String val:names)                  //used For each Loop
        {
            System.out.print(val+" ");
        }

    }
}

