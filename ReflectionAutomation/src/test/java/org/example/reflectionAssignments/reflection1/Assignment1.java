package org.example.reflectionAssignments.reflection1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



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

    public static WebDriver objBrowser=null;

    public static void launchChromeBrowser()
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

    public static void navigateActiTimeURl()
    {
        try
        {
            objBrowser.get("http://localhost:81/login.do");
            Thread.sleep(4000);

//            System.out.println("Navigating ActiTime URl");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void login()
    {
        try
        {
            objBrowser.findElement(By.id("username")).sendKeys("admin");
            Thread.sleep(3000);

            objBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(3000);

            objBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
            Thread.sleep(5000);

//            System.out.println("Login into ActiTime web App");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void minimizeFlyoutWindow()
    {
        try
        {
            objBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(3000);
//            System.out.println("gettingStartedShortcutsPanelId");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void createUser() {
        try {
            objBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);

            objBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
            Thread.sleep(3000);
            objBrowser.findElement(By.name("firstName")).sendKeys("User1");
            Thread.sleep(3000);

            objBrowser.findElement(By.name("lastName")).sendKeys("U1");
            Thread.sleep(3000);

            objBrowser.findElement(By.name("email")).sendKeys("user1@user.com");
            Thread.sleep(3000);

            objBrowser.findElement(By.name("username")).sendKeys("user1");
            Thread.sleep(3000);

            objBrowser.findElement(By.name("password")).sendKeys("user1");
            Thread.sleep(3000);

            objBrowser.findElement(By.name("passwordCopy")).sendKeys("user1");
            Thread.sleep(3000);
            objBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span\n")).click();
            Thread.sleep(5000);

//            System.out.println("Create User by giving all valid details");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public static void deleteUser1()
        {
            try
            {
                objBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
                Thread.sleep(3000);

                objBrowser.findElement(By.xpath("//span[text()='U1, User1']")).click();
                Thread.sleep(3000);
                objBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
                Thread.sleep(3000);

                Alert objAlert=objBrowser.switchTo().alert();
                String content=objAlert.getText();
                System.out.println(content);
                objAlert.accept();
                Thread.sleep(3000);

//                System.out.println("Deleting user ");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    public static void logOut()
    {
        try{
            objBrowser.findElement(By.id("logoutLink")).click();
            Thread.sleep(3000);

//            System.out.println("Logout");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void appClose()
    {
        try
        {
            objBrowser.quit();

//            System.out.println("Application close");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

