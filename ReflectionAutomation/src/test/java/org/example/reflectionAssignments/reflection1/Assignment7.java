package org.example.reflectionAssignments.reflection1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
    public static void main(String[] args) {
        launchBrowser();
        navigateActiTime();
        logIn();
        minimizeFlyoutWindow();
        createCustomer();
        createProject();
        createTask();
        deleteTask();
        deleteProject();
        logOut();
        appClose();
    }


//    Q7) launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->
//    Create Tasks -->DeleteTasks-->DeleteProject--> deleteCustomer-->logout -->closeApplication

    public static WebDriver oBrowser=null;

    public static void launchBrowser()
    {
        try{
            oBrowser=new ChromeDriver();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void navigateActiTime()
    {
        try{
            oBrowser.get("http://localhost:81/login.do");
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void logIn()
    {
        try{
            oBrowser.findElement(By.name("username")).sendKeys("admin");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void minimizeFlyoutWindow()
    {
        try
        {
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(3000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void createCustomer()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("PASSPORT SAVA");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(3000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void createProject()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
            Thread.sleep(3000);
            //Project naming
            oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("INSTANT PASSPORT");
            Thread.sleep(3000);
            //Descriptions
            oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Approval of passport will be very easy and immediately to applier");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
            Thread.sleep(3000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void createTask()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("User Verify");
            Thread.sleep(3000);

            oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[5]/div/input")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.id("createTasksPopup_commitBtn")).click();
            Thread.sleep(3000);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void deleteTask()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
            Thread.sleep(3000);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void deleteProject()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")).click();
            Thread.sleep(3000);


//                Deleting Customer
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
            Thread.sleep(3000);

            //clicking delete in Action
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
            Thread.sleep(3000);

            //clicking Deleting permanently
            oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
            Thread.sleep(3000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void logOut()
    {
        try{
            oBrowser.findElement(By.id("logoutLink")).click();
            Thread.sleep(3000);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void appClose()
    {
        try{
            oBrowser.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

