package salenium.javaScript.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1CreateUser {
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyOutwindow();
        CreatingUser();
        modifyUser();
        logOut();
        appClose();



    }

    public static WebDriver oBrowser=null;
    public static Ass1ActiPage oPage=null;

        private static void launchBrowser()
        {
            try
            {
                oBrowser=new ChromeDriver();
                oPage=new Ass1ActiPage(oBrowser);
                Thread.sleep(4000);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        private static void navigateURL()
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

        private static void login()
        {
            try{
                oPage.getUsername().sendKeys("Admin");
                oPage.getPassword().sendKeys("manager");
                oPage.getLoginIn().click();
                Thread.sleep(5000);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        private static void minimizeFlyOutwindow()
        {
            try
            {
                oPage.getFlyOutWindow().click();
                Thread.sleep(2000);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        private static void CreatingUser()
        {
            try
            {
                oPage.getUsersWindow().click();
                Thread.sleep(2000);

                oPage.getAddUser().click();
                Thread.sleep(2000);

                oPage.getFirstname().sendKeys("User1");
                Thread.sleep(3000);
                oPage.getLastName().sendKeys("M");
                Thread.sleep(3000);
                oPage.getEmail().sendKeys("user1m@company.in");
                Thread.sleep(3000);

                oPage.getUserDataLightBox_usernameField().sendKeys("user1");
                Thread.sleep(3000);
                oPage.getUserDataLightBox_passwordField().sendKeys("user123");
                Thread.sleep(3000);
                oPage.getUserDataLightBox_passwordCopyField().sendKeys("user123");
                Thread.sleep(5000);

                oPage.getCreateUser().click();
                Thread.sleep(2000);

            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        private static void modifyUser()
        {
            try
            {
                oPage.getModifyUser().click();
                Thread.sleep(3000);

                oPage.getModifyUserDataLightBox_passwordField().sendKeys("User1234");
                Thread.sleep(3000);

                oPage.getModifyUserDataLightBox_passwordCopyField().sendKeys("User1234");
                Thread.sleep(3000);

                oPage.getSaveChanges().click();
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static void logOut()
        {
            try
            {
                oPage.getLogout().click();
                Thread.sleep(2000);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        private static void appClose()
        {
            try
            {
                oBrowser.quit();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
}
