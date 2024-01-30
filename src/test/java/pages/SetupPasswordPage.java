package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.pageMethods.BasePageMethods;

public class SetupPasswordPage extends BasePageMethods {

    @FindBy(xpath = "(//input[@data-testid='setup-password-title-input'])")
    public WebElement gruopNameInput;
    @FindBy(xpath = "(//input[@data-testid='setup-password-password-input'])")
    public WebElement passwordInput;
    @FindBy(xpath = "(//input[@data-testid='setup-password-confirm-password-input'])")
    public WebElement confirmPasswordInput;
    @FindBy(xpath = "(//button[@data-testid='setup-password-continue'])")
    public WebElement setupMyPasswordButton;
}
