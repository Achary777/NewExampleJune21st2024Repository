package salenium.assignmentActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

    public static void main(String[] args) {
        launchBrowser();
        navigateActiTime();
        logIn();
        minimizeFlyoutWindow();
        createCustomer();
        deleteCutomer();
        logOut();
        appClose();
    }


    //Q3:launchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication

    private static WebDriver oBrowser=null;

    private static void launchBrowser()
    {
        try{
            oBrowser=new ChromeDriver();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateActiTime()
    {
        try{
            oBrowser.get("http://localhost:81/login.do");
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void logIn()
    {
        try{
            oBrowser.findElement(By.name("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(1000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

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

    private static void createCustomer()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
            Thread.sleep(1000);
            oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
            Thread.sleep(1000);
            oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer1");
            Thread.sleep(1000);
            oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void deleteCutomer()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void logOut()
    {
        try{
            oBrowser.findElement(By.id("logoutLink")).click();
            Thread.sleep(2000);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void appClose()
    {
        try{
            oBrowser.close();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
