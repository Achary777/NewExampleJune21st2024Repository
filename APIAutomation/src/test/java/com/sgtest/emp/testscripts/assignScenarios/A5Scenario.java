package com.sgtest.emp.testscripts.assignScenarios;

//5. Create employee --> verify existence of employee(head Method) -->
// Delete Head method --> Again verify using Head Method


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

public class A5Scenario {

    public static String employeeId=null;
    @Test(priority = 1)
    public void Create_employee()
    {
        try{
            System.out.println("This step deals with creation of Employee data in the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees";
            RequestSpecification httpRequest= RestAssured.given();

//          Create Request Body
            String filePath="datafiles/data_Head5.json";
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
            System.out.println("This step deals with verify existence of Head Method Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId;
            RequestSpecification httpRequest =RestAssured.given();
            //Specify the Header
            httpRequest.header("Content-Type","application/json");
            //Execute GET Http Request to List all Employee
            Response response=httpRequest.head();
            String content=response.asPrettyString();
            System.out.println(content);

            //Diplay Verify Status Response Code
            int ResponseCode = response.getStatusCode();
            System.out.println("Diplay Verify Status Response Code : "+ResponseCode);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void delete_employee()
    {
        try
        {
            System.out.println("This step deals with deletetion of Head Method Employee data from the database");
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

    @Test(priority = 4)
    public void VerifyHead_employee()
    {
        try
        {
            System.out.println("This step deals with Verify the delete of Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId;
            RequestSpecification httpRequest =RestAssured.given();
            //Specify the Header
            httpRequest.header("Content-Type","application/json");
            //Execute GET Http Request to List all Employee
            Response response=httpRequest.head();
            String content=response.asPrettyString();
            System.out.println(content);

            //Diplay Verify Status Response Code
            int ResponseCode = response.getStatusCode();
            System.out.println("Diplay Verify Status Response Code : "+ResponseCode);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
