package salenium.javaScript.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ass1ActiPage {
    public Ass1ActiPage(WebDriver oBrowser)
    {
        PageFactory.initElements(oBrowser,this);
    }

    //usereName text field
    private WebElement username;        //username is taken by html inspection
    public WebElement getUsername()
    {
        return username;
    }

    //Password Text Field
    private WebElement pwd;       //pwd is taken by html inspection
    public WebElement getPassword()
    {
        return pwd;
    }

    //Login button field
    @FindBy(xpath = "//div[text()='Login ']")
    private WebElement oLogin;
    public WebElement getLoginIn()
    {
        return oLogin;
    }

    //Flyout window Element

    private WebElement gettingStartedShortcutsMenuCloseId; //We should give Id or Name which available in html inspection window, If both not available go for xpath
    public WebElement getFlyOutWindow()
    {
        return gettingStartedShortcutsMenuCloseId;
    }
    //Clicking Users
    @FindBy(xpath = "//div[text()='USERS']")
    private WebElement clickingUsers;
    public WebElement getUsersWindow()
    {
        return clickingUsers;
    }

    //Click  on Add user button
    @FindBy(xpath = "//div[text()='Add User']")
    private WebElement addUser;
    public WebElement getAddUser()
    {
        return addUser;
    }

    //firstName field
    private WebElement firstName;
    public WebElement getFirstname()
    {
        return firstName;
    }

    //lastName field
    private WebElement lastName;
    public WebElement getLastName()
    {
        return lastName;
    }

    //Email field
    private WebElement email;
    public WebElement getEmail()
    {
        return email;
    }

    //Login Details
    //UserName field
    private WebElement userDataLightBox_usernameField;
    public WebElement getUserDataLightBox_usernameField()
    {
        return userDataLightBox_usernameField;
    }

    //Password field
    private WebElement userDataLightBox_passwordField;
    public WebElement getUserDataLightBox_passwordField()
    {
        return userDataLightBox_passwordField;
    }

    //Retype Password field
    private WebElement userDataLightBox_passwordCopyField;
    public WebElement getUserDataLightBox_passwordCopyField()
    {
        return userDataLightBox_passwordCopyField;
    }

    //Create Link Button
    private WebElement userDataLightBox_commitBtn;
    public WebElement getCreateUser()
    {
        return userDataLightBox_commitBtn;
    }


    //Modify user
    //click modify User
    @FindBy(xpath = "//span[text()='M, User1']")
    private WebElement modifyUser;
    public WebElement getModifyUser()
    {
        return modifyUser;
    }

    //Password field
    @FindBy(xpath = "//*[@id=\"userDataLightBox_passwordField\"]")
    private WebElement modifyUserPassword;
    public WebElement getModifyUserDataLightBox_passwordField()
    {
        return modifyUserPassword;
    }

    //Retype Password field
    @FindBy(xpath = "//*[@id=\"userDataLightBox_passwordCopyField\"]")
    private WebElement modifyUserRetypePassword;
    public WebElement getModifyUserDataLightBox_passwordCopyField()
    {
        return modifyUserRetypePassword;
    }

    //Save Changes
    @FindBy(xpath = "//*[@id=\"userDataLightBox_commitBtn\"]/div")
    private WebElement saveChanges;
    public WebElement getSaveChanges()
    {
        return saveChanges;
    }

    //Delete user
    @FindBy(xpath = "//span[text()='M, User1']")
    private WebElement clickModifyUser;
    public WebElement getModifyUserWindow()
    {
        return clickModifyUser;
    }

    private WebElement userDataLightBox_deleteBtn;
    public WebElement getDeleteuser()
    {
        return userDataLightBox_deleteBtn;
    }

    //Logout link field
    @FindBy(linkText = "Logout")
    private WebElement oLogout;
    public WebElement getLogout()
    {
        return oLogout;
    }
}
