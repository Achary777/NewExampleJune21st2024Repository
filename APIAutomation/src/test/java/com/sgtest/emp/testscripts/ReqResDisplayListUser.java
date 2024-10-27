package com.sgtest.emp.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ReqResDisplayListUser {

    @Test
    public static void DisplayListUser()
    {
        try{
            RestAssured.baseURI="https://reqres.in/api/users?page=2";
            RequestSpecification httpRequest=RestAssured.given();

            httpRequest.header("Content-Type","application/json");

            Response response=httpRequest.get();
            String content=response.asPrettyString();
            System.out.println(content);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
