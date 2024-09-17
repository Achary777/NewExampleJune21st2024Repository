package org.example.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment2 {
    public static void main(String[] args) {
        launchChromeBrowser();
        navigateActiTime();
        login();
        minimizeFlyoutWindow();
        createUser();
        modificationOfUser();
        deleteUser();
        appClose();
    }

    //Q2) launchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication

    private static WebDriver oBrowser=null;


    @Test(priority = 1)
    private static void launchChromeBrowser()
    {
       try
       {
           oBrowser=new ChromeDriver();
           Thread.sleep(4000);
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }

    @Test(priority = 2)
    private static void navigateActiTime()
    {
        try
        {
            oBrowser.get("http://localhost:81/login.do");
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    private static void login()
    {
        try{
            oBrowser.findElement(By.name("username")).sendKeys("admin");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    private static void minimizeFlyoutWindow()
    {
        try
        {
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }



    //createUser
    @Test(priority = 5)
    private static void createUser()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            oBrowser.findElement(By.name("firstName")).sendKeys("User");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).sendKeys("admin");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("email")).sendKeys("adminUser@gentec.com");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("username")).sendKeys("AdminUser");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("adminUser");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("adminUser");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(3000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


//    modifyUser
    @Test(priority = 6)
    private static void modificationOfUser()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='admin, User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).clear();     //Modifying admin to systemadmin
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).sendKeys("systemadmin");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
            Thread.sleep(3000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 7)
    private static void deleteUser()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
//            oBrowser.findElement(By.xpath()).click();
            oBrowser.findElement(By.xpath("//span[text()='systemadmin, User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();

           // Alert or pop window handle
            Alert oUserDelete=oBrowser.switchTo().alert();
            String content=oUserDelete.getText();
            System.out.println(content);
            oUserDelete.accept();
            Thread.sleep(3000);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 8)
    private static void appClose()
    {
        try
        {
            oBrowser.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
