package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.LoginPage;
import utilities.DriverManager;
import utilities.pageMethods.LoginPageMethods;

public class LoginPageStepDefs extends LoginPageMethods {
    @Given("Açılan giriş sayfasında {string} ve {string} alanları doldurulur")
    public void açılanGirişSayfasındaVeAlanlarıDoldurulur(String mail, String password) {
        sendKeys(eMailAddress,mail);
        sendKeys(passwordInput,password);
    }

    @And("Continue butonuna basarak başarılı giriş sağlandığı gözlenir")
    public void continueButonunaBasarakBaşarılıGirişSağlandığıGözlenir() {
        click(continueButton);
        implicitlyWait(3);
    }

    @And("Açılan profilin bilgilerinin {string} ve  {string} eşleştiği doğrulanır")
    public void açılanProfilinBilgilerininVeEşleştiğiDoğrulanır(String firstName, String lastName) {
        checkName(firstName,lastName);
    }

    @And("Çıkış yapılarak ana sayfaya yönlendirildiği gözlenir")
    public void çıkışYapılarakAnaSayfayaYönlendirildiğiGözlenir() {
        click(exitBtn);
        implicitlyWait(2);
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().endsWith("login"));
    }
}
