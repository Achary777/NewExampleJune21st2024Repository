package com.sgtest.emp.testscripts.assignScenarios;


//4.create employee --> display employee --> modify employee using patch method -->
//  display employee ---> delete employee

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

public class A4Scenario {

    public static String employeeId=null;
    @Test(priority = 1)
    public void Create_employee()
    {
        try{
            System.out.println("This step deals with creation of Employee data in the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees";
            RequestSpecification httpRequest= RestAssured.given();

//          Create Request Body
            String filePath="datafiles/data_createmployee3.json";
            File jsonObj=new File(filePath);

            //Header
            httpRequest.header("Content-Type","application/json");
            //See "Content_Type"&"application/json" in postman app, Below Header Section

            //Provide Body section
            httpRequest.body(jsonObj);

            //Get Response from the Server
            Response response=httpRequest.post();

            String content=response.asPrettyString();
            System.out.println(content);

            //Display employee Id
            JsonPath jpath=response.jsonPath();
            employeeId = jpath.getString("id");
            System.out.println("Employee Id : "+employeeId);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void display_employee()
    {
        try
        {
            System.out.println("This step deals with display of Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId;
            RequestSpecification httpRequest =RestAssured.given();
            //Specify the Header
            httpRequest.header("Content-Type","application/json");
            //Execute GET Http Request to List all Employee
            Response response=httpRequest.get();
            String content=response.asPrettyString();
            System.out.println(content);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void modifyPatch_employee()
    {
        try{
            System.out.println("This step deals with modify using PATCH Method of Employee data in the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId;
            RequestSpecification httpRequest= RestAssured.given();

//          Create Request Body
            String filePath="datafiles/data_createmployee4.json";
            File jsonObj=new File(filePath);

            //Header
            httpRequest.header("Content-Type","application/json");
            //See "Content_Type"&"application/json" in postman app, Below Header Section

            //Provide Body section
            httpRequest.body(jsonObj);

            //Get Response from the Server
            Response response=httpRequest.patch();

            String content=response.asPrettyString();
            System.out.println(content);

//            //Display employee Id
//            JsonPath jpath=response.jsonPath();
//            employeeId = jpath.getString("id");
//            System.out.println("Employee Id : "+employeeId);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void displayModified_employee()
    {
        try
        {
            System.out.println("This step deals with display of modified PATCH Method Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId;
            RequestSpecification httpRequest =RestAssured.given();
            //Specify the Header
            httpRequest.header("Content-Type","application/json");
            //Execute GET Http Request to List all Employee
            Response response=httpRequest.get();
            String content=response.asPrettyString();
            System.out.println(content);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void delete_employee()
    {
        try
        {
            System.out.println("This step deals with deletetion of modified PATCH Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId;
            RequestSpecification httpRequest =RestAssured.given();
            //Specify the Header
            httpRequest.header("Content-Type","application/json");
            //Execute GET Http Request to List all Employee
            Response response=httpRequest.delete();
            String content=response.asPrettyString();
            System.out.println(content);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

