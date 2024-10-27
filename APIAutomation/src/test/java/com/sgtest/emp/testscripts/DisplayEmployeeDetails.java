package com.sgtest.emp.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DisplayEmployeeDetails {

    @Test
        public static void displayEmployees()
        {
            try
            {
                RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees";
             RequestSpecification httpRequest =RestAssured.given();

             //Specify the header
                httpRequest.header("Content-Type","application/json");

                //Execute GET Http Request to List all Employees
                Response response= httpRequest.get();
                String content= response.asPrettyString();
                System.out.println(content);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

}
