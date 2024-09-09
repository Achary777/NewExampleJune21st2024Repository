package salenium.assignmentActiTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdvanceScenario2 {

    public static WebDriver oBrowser=null;
    public static void main(String[] args){
        launchBrowser();
        navigate();
//        login();
//        minimizeFlyoutWindow();
//        createUser1();
//        loginUser1();
//        createUser2();
//        loginUser2();
//        createUser3();
//        loginUser3();
//        loginUser2Modify();
//        loginUser3Modify();
//        loginUser1Modify();
//        loginUser21();
//        loginAdminUser1Modify();
//        loginUser11();
        loginUser2delUser3();
        loginUser1delUser2();
        loginAdmindelUser1();
//        closeApp();
    }


 /*  2)launchBrowser-->navigate-->login as admin-->createuser [User1] >logout ->login as User1-->createUser [User2] -->
     logout -->login as User2 --> createUser [User3]--> logout-->login as User3 --> logout >login as User2 -->
     modify password for User3-->logout --> login as User3 --> logout-->login as User1 -->modify password for User2 -->
     logout -->login as User2 --> logout-->login as admin--> modify password for User1 --> logout -->login as User1 --> logout -->
     login as User2 --> Delete User3--> logout --> login as User1 --> delete USer2 --> logout --> login as Admin --> delete User1 --> logout
      --> closeApplication   */
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

//    login as admin-->createuser [User1] >logout ->
    private static void createUser1() {
        try {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("firstName")).sendKeys("User1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).sendKeys("M");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("email")).sendKeys("User1.m@company.in");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    login as User1-->
    private static void loginUser1() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    createUser [User2] -->logout -->
    private static void createUser2() {
        try {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("firstName")).sendKeys("User2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).sendKeys("Nexa");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("email")).sendKeys("nexauser@company.in");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    login as User2 -->
    private static void loginUser2() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    createUser [User3]--> logout-->
    private static void createUser3() {
        try {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("firstName")).sendKeys("User3");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("lastName")).sendKeys("Neo");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("email")).sendKeys("neouser3@company.in");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch(Exception e ){
            e.printStackTrace();
        }
    }

//login as User3 --> logout-->
    private static void loginUser3() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    login as User2 -->
    private static void loginUser2Modify() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);

//            modify password for User3 -->logout -->
            oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("demoUser33");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("demoUser33");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//     login as User3 --> logout-->
    private static void loginUser3Modify() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser33");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    login as User1 -->
    private static void loginUser1Modify() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);

//      modify password for User2 -->logout -->
            oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("demoUser22");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("demoUser22");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    login as User2 --> logout-->
    private static void loginUser21() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser22");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    login as admin-->
    private static void loginAdminUser1Modify()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);

//            minimizeFlyoutWindow();
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
            //oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            //Thread.sleep(2000);

//    modify password for User1 -->logout
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.name("password")).sendKeys("demoUser11");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("demoUser11");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


//    login as User1 --> logout -->
    private static void loginUser11() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser11");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    login as User2 --> Delete User3--> logout -->
    private static void loginUser2delUser3() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser22");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Neo, User3']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
            Thread.sleep(3000);
            Alert oAlert=oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    login as User1 --> delete User2 --> logout -->
    private static void loginUser1delUser2() {
        try {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("demoUser11");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='Nexa, User2']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
            Thread.sleep(3000);
            Alert oAlert=oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }


//    login as Admin --> delete User1 --> logout --> closeApplication
    private static void loginAdmindelUser1()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            Thread.sleep(3000);
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(3000);

            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);

            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//span[text()='M, User1']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
            Thread.sleep(3000);
            Alert oAlert1=oBrowser.switchTo().alert();
            String content1=oAlert1.getText();
            System.out.println(content1);
            oAlert1.accept();
            Thread.sleep(3000);
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void closeApp()
    {
        try
        {
            oBrowser.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}