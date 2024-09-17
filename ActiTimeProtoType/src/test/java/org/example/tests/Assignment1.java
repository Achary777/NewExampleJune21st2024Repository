package org.example.tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Assignment1 {

    public static void main(String[] args) {
        launchChromeBrowser();
        navigateActiTimeURl();
        login();
        minimizeFlyoutWindow();
        createUser();
        deleteUser1();
        logOut();
        appClose();
    }

//    Q1) launchBrowser-->navigate-->login-->createUser-->deleteUser-->logout-->closeApplication

    private static WebDriver objBrowser=null;

    @Test(priority = 1)
    private static void launchChromeBrowser()
    {
        try
        {
            objBrowser=new ChromeDriver();
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    private static void navigateActiTimeURl()
    {
        try
        {
            objBrowser.get("http://localhost:81/login.do");
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    private static void login()
    {
        try
        {
            objBrowser.findElement(By.id("username")).sendKeys("admin");
            objBrowser.findElement(By.name("pwd")).sendKeys("manager");
            objBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
            Thread.sleep(5000);
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
            objBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    private static void createUser() {
        try {
            objBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
            objBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
            Thread.sleep(2000);
            objBrowser.findElement(By.name("firstName")).sendKeys("User1");
            objBrowser.findElement(By.name("lastName")).sendKeys("U1");
            objBrowser.findElement(By.name("email")).sendKeys("user1@user.com");
            Thread.sleep(2000);
            objBrowser.findElement(By.name("username")).sendKeys("user1");
            objBrowser.findElement(By.name("password")).sendKeys("user1");
            objBrowser.findElement(By.name("passwordCopy")).sendKeys("user1");
            Thread.sleep(2000);
            objBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span\n")).click();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @Test(priority = 6)
        private static void deleteUser1()
        {
            try
            {
                objBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
                Thread.sleep(2000);

                objBrowser.findElement(By.xpath("//span[text()='U1, User1']")).click();
                Thread.sleep(2000);
                objBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
                Thread.sleep(3000);

                Alert objAlert=objBrowser.switchTo().alert();
                String content=objAlert.getText();
                System.out.println(content);
                objAlert.accept();
                Thread.sleep(2000);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    @Test(priority = 7)
    private static void logOut()
    {
        try{
            objBrowser.findElement(By.id("logoutLink")).click();
            Thread.sleep(2000);
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
            objBrowser.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

