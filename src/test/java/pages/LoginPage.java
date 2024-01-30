package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.pageMethods.BasePageMethods;

public class LoginPage extends BasePageMethods {

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement eMailAddress;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordInput;
    @FindBy(xpath = "//span[@class='el-checkbox__inner']")
    public WebElement rememberMeCheckBox;
    @FindBy(xpath = "(//span[@class='el-checkbox__label'])[1]")
    public WebElement rememberMeText;
    @FindBy(xpath = "(//a[normalize-space()='Forgot Password'])[1]")
    public WebElement forgotPassword;
    @FindBy(xpath = "(//span[normalize-space()='Continue'])[1]")
    public WebElement continueButton;
    @FindBy(xpath = "(//span[normalize-space()='Create Account'])[1]")
    public WebElement createAccountButton;



}
