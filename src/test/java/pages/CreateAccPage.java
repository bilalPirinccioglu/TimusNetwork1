package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.pageMethods.BasePageMethods;

import java.util.List;

public class CreateAccPage extends BasePageMethods {
    @FindBy(xpath = "(//input[@data-testid='register-firstname-input'])[1]")
    public WebElement firstNameInput;
    @FindBy(xpath ="(//input[@data-testid='register-lastname-input'])[1]")
    public WebElement lastNameInput;
    @FindBy(xpath ="(//input[@data-testid='register-email-input'])")
    public WebElement eMailAddressInput;
    @FindBy(xpath ="(//div[@data-testid='register-country-dropdown'])")
    public  WebElement registerCountryDropdown;
    @FindBy(xpath ="(//li[@class='el-select-dropdown__item'])")
    public List<WebElement> registerCountryList ;
    @FindBy(xpath ="(//label[@data-testid='register-privacy-policy-checkbox'])[1]")
    public  WebElement registerPrivacyPolicyCheckBox;
    @FindBy(xpath ="(//label[@data-testid='register-privacy-policy-checkbox'])[2]")
    public WebElement registerTermsOfServicesCheckBox;
    @FindBy(xpath ="(//button[@data-testid='register-continue']/span)")
    public WebElement registerContinueButton;
    @FindBy(xpath ="//button[@data-testid='forgot-password-login']")
    public WebElement welcomeButton;
    @FindBy(xpath ="(//span[normalize-space()='Privacy Policy'])[1]")
    public WebElement privacyPolicyTextLink;
    @FindBy(xpath ="(//span[normalize-space()='Terms of Service'])[1]")
    public WebElement termsOfServicesTextLink;
    @FindBy(xpath ="//button[@data-testid='pages-register-index-zfrzzhrgq']")//dataTestId garip
    public WebElement readAndAcceptButton;
    @FindBy(xpath = "//h1[@data-testid='pages-register-index-fcozvcbhdh']")
    public WebElement checkMailForVerifyMessage;
    @FindBy(xpath = "//iframe[@data-testid='pages-register-index-fnkwbxnok']")
    public WebElement iFrame;



}
