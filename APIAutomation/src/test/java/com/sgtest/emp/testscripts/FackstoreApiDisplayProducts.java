package com.sgtest.emp.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class FackstoreApiDisplayProducts {


    @Test
    public static void displayEmployees()
    {
        try
        {

//            class/interface.method="URL";
            RestAssured.baseURI="https://fakestoreapi.com/products";

//
            RequestSpecification httpRequest =RestAssured.given();

            httpRequest.header("Content-Type","application/json");


            Response response= httpRequest.get();
            String content= response.asPrettyString();
            System.out.println(content);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
