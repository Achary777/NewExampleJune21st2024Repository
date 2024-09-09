package salenium.assignmentActiTime;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1 {

    public static void main(String[] args) {
        launchBrowser();
        navigate();
        login();
        minimizeFlyoutWindow();
        createUser();
        loginuser();
        modifyuserpassword();
        loginmodifyuser();
        deleteuser();
        logout();
        closeApp();
    }

    public static WebDriver oBrowser=null;

/*    Q1) launchBrowser-->navigate-->login as admin-->createuser[User1, User2, User3] -->logout--->loginasUser1--->logout-->
    Login as User2 --> logout -->login as User3 --> logout-->login as admin [modify the password for User1, User2, User3] -->
    logout -->login as User1--- >logout-->Login as User2 --> logout -->login as User3 --> logout-- >login as Admin -->
    Delete [User1, User2, User3]-->logout >closeApplication  */

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            Thread.sleep(3000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void navigate()
    {
        try
        {
            oBrowser.get("http://localhost:81/login.do");
            Thread.sleep(3000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void login()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(5000);
        }catch (Exception e)
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
    private static void createUser() {
        try {
           oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("firstName")).sendKeys("Kakasi");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).sendKeys("HatKe");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("email")).sendKeys("Kakasi@sandzone.in");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("Qwerty");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty");
            Thread.sleep(3000);


            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("firstName")).sendKeys("Naruto");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).sendKeys("Uzumaki");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("email")).sendKeys("nuzumaki@sandzone.in");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("Qwerty");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty");
            Thread.sleep(3000);


            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("firstName")).sendKeys("Zeerayu");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).sendKeys("Alone");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("email")).sendKeys("alone@sandzone.in");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("Qwerty");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(3000);


            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void loginuser(){
        try{

//            User login & logOut
            oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.id("logoutLink")).click();
//            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);

//            User2 logIn & logOut
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.id("logoutLink")).click();
            Thread.sleep(2000);

//            User1 logIn & logOut
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.id("logoutLink")).click();
//            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void modifyuserpassword(){
        try{
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);

//            minimizeWindow
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);

            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(3000);


            oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginmodifyuser(){
        try{
            oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("Qwerty1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void deleteuser(){
        try{
//            minimizeWindow
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);

            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Alone, Zeerayu']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
            Alert oAlert=oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
            Thread.sleep(2000);

            oBrowser.findElement(By.xpath("//span[text()='HatKe, Kakasi']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
            Thread.sleep(3000);
            Alert oAlert1=oBrowser.switchTo().alert();
            String content1=oAlert1.getText();
            System.out.println(content1);
            oAlert1.accept();

            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Uzumaki, Naruto']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
            Thread.sleep(5000);
            Alert oAlert2=oBrowser.switchTo().alert();
            String content2=oAlert2.getText();
            System.out.println(content2);
            oAlert2.accept();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void logout()
    {
        try
        {
//            oBrowser.findElement(By.id("logoutLink")).click();
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void closeApp()
    {
        try
        {
            oBrowser.close();
            Thread.sleep(3000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}