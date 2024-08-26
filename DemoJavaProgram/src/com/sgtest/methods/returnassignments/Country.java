package com.sgtest.methods.returnassignments;

class CountryName
{
    String getCountryName(String cname)
    {
        return cname;
    }
}
public class Country {
    public static void main(String[] args) {
        CountryName cn=new CountryName();
        String name=cn.getCountryName("INDIA");
        System.out.println("Name of country : "+name);

    }
}
