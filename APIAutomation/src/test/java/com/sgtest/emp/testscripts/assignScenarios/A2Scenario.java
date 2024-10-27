package com.sgtest.emp.testscripts.assignScenarios;


//   Q2[Scenario]: 2. create 2 employee> display 1 by 1 employee>delete both employee ?

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

public class A2Scenario {
    public static String employeeId1=null;
    public static String employeeId2=null;

    @Test(priority = 1)
    public void Create_1employee()
    {
        try{
            System.out.println("This step deals with creation of Employee data in the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees";
            RequestSpecification httpRequest= RestAssured.given();

//          Create Request Body
            String filePath="datafiles/data_createmployee1.json";
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
            employeeId1 = jpath.getString("id");
            System.out.println("Employee Id : "+employeeId1);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void Create_2employee()
    {
        try{
            System.out.println("This step deals with creation of Employee data in the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees";
            RequestSpecification httpRequest = RestAssured.given();

            String filePath="datafiles/data_createmployee2.json";
            File jsonObj = new File(filePath);

            httpRequest.header("Content-Type","application/json");

            httpRequest.body(jsonObj);

            Response response = httpRequest.post();

            String content = response.asPrettyString();
            System.out.println(content);

            JsonPath jpath=response.jsonPath();
            employeeId2 = jpath.getString("id");
            System.out.println("Employee Id :"+employeeId2);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void display_1employee()
    {
        try
        {
            System.out.println("This step deals with display of Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId1;
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

    @Test(priority = 4)
    public void display_2employee()
    {
        try
        {
            System.out.println("This step deals with display of Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId2;
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
    public void delete_1employee()
    {
        try
        {
            System.out.println("This step deals with deletetion of Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId1;
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

    @Test(priority = 6)
    public void delete_2employee()
    {
        try
        {
            System.out.println("This step deals with deletetion of Employee data from the database");
            RestAssured.baseURI="http://localhost:8082/sgtesting/api/v1/employees/"+employeeId2;
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
