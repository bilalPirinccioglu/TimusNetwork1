package stepdefinitions;

import io.cucumber.java.en.*;
import pages.CreateAccPage;
import pages.LoginPage;
import utilities.ReusableMethods;
import utilities.pageMethods.CreateAccPageMethods;

public class CreateAccStepDefs extends CreateAccPageMethods {

    LoginPage loginPage= new LoginPage();

    @Given("Ana sayfa üzerinden yeni hesap oluşturma butonuna tıklanır")
    public void anaSayfaÜzerindenYeniHesapOluşturmaButonunaTıklanır() {
        click(loginPage.createAccountButton);

    }
    @When("First name alanı {string} Last Name alanı {string} ile doldurulur")
    public void first_name_alanı_last_name_alanı_ile_doldurulur(String firstName, String lastName) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
    }

    @And("Mock email sayfasında bir e mail oluşturulur")
    public void mockEmailSayfasındaBirEMailOluşturulur() {
        //navigateNewMailPage();
    }

    @And("Oluşturulan e mail Email address alanına girilir")
    public void oluşturulanEMailEmailAddressAlanınaGirilir() {
    }

    @And("Country alanından {string} seçilir")
    public void countryAlanındanSeçilir(String country) {
        selectCountry(country);
    }

    @And("Privacy Policy  okunur ve kabul edilir")
    public void privacyPolicyOkunurVeKabulEdilir() {
        click(privacyPolicyTextLink);
        pageDownAndAccept();

    }

    @And("Terms Of Service okunur ve kabul edilir")
    public void termsOfServiceOkunurVeKabulEdilir() {
        click(termsOfServicesTextLink);
        pageDownAndAccept();

    }

    @And("Continue butonna basılarak başarılı şekilde oluşturma maili gönderildiği gözlemlenir")
    public void continueButonnaBasılarakBaşarılıŞekildeOluşturmaMailiGönderildiğiGözlemlenir() {
        click(registerContinueButton);
        ReusableMethods.wait(1);
        checkMailMessage();
    }

    @And("Mock Email sayfasındaki mail açılır ve gelen Set Password linkine tıklanır")
    public void mockEmailSayfasındakiMailAçılırVeGelenSetPasswordLinkineTıklanır() {
    }

    @And("Sayfa boşken şifre kontrollerinin hepsinin olumsuz olduğu gözlemlenir")
    public void sayfaBoşkenŞifreKontrollerininHepsininOlumsuzOlduğuGözlemlenir() {
    }

    @And("Company Name alanı {string} Password alanı {string} Confirm Password alanı {string} ile doldurulur")
    public void companyNameAlanıPasswordAlanıConfirmPasswordAlanıIleDoldurulur(String companyName, String password, String confirmedPassword) {
    }

    @And("Set Up My Password butonu ile başarılı şifre oluşturulduğu ve siteye soktuğu gözlemlenir")
    public void setUpMyPasswordButonuIleBaşarılıŞifreOluşturulduğuVeSiteyeSoktuğuGözlemlenir() {
    }


    @And("{string} Email address alanına girilir")
    public void emailAddressAlanınaGirilir(String eMail) {
        sendKeys(eMailAddressInput,eMail);
    }
}
