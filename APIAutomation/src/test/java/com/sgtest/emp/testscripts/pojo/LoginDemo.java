package com.sgtest.emp.testscripts.pojo;


//CASE1> Create POJO class and Based on the POJO class create the JSON Object.

//Part B
//Run normally this class only , Not Login
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class LoginDemo {

    @Test(priority = 1)
    public void displayJsonObject()
    {
        try
        {
            Login obj1=new Login("Shashi","Welcome123");
            //JSON Object
            ObjectMapper mapper=new ObjectMapper();
            String jsonObject=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
            System.out.println(jsonObject);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void displayArrayOfJsonObject()
    {
        try
        {
            Login obj1[]={
                    new Login("Shashi","Welcome123"),
                    new Login("Puneeth","Welcome456"),
                    new Login("Vishanth","Welcome789")
            };
            //JSON Object
            ObjectMapper mapper=new ObjectMapper();
            String jsonObject=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
            System.out.println(jsonObject);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
