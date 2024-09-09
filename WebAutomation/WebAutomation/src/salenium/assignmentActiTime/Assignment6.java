package salenium.assignmentActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
    public static void main(String[] args) {
        launchBrowser();
        navigateActiTime();
        logIn();
        minimizeFlyoutWindow();
        createCustomer();
        createProject();
        modifyProject();
        deleteProject();
//        deleteCustomer();

        logOut();
        appClose();
    }

//    Q6) launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->
//    modifyProject -->DeleteProject-->deleteCustomer-->logout -->closeApplication ?


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
            oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("KAKASI ATKE");
            Thread.sleep(1000);
            oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void createProject()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
            Thread.sleep(1000);
            oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
            Thread.sleep(1000);
            //Project naming
            oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("GREENTECH");
            Thread.sleep(2000);
            //Descriptions
            oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Its a software solution company");
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
            Thread.sleep(2000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void modifyProject()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
            Thread.sleep(2000);

            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void deleteProject()
    {
        try{
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")).click();
            Thread.sleep(2000);


//                Deleting Customer
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
            Thread.sleep(1000);
            oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
            Thread.sleep(1000);
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
            Thread.sleep(1000);

            //clicking delete in Action
            oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
            Thread.sleep(2000);

            //clicking Deleting permanently
            oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
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
