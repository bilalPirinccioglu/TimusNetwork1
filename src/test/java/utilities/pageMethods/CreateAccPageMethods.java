package utilities.pageMethods;

import org.junit.Assert;
import org.junit.experimental.theories.PotentialAssignment;
import org.openqa.selenium.JavascriptExecutor;
import pages.CreateAccPage;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ReusableMethods;


public class CreateAccPageMethods extends CreateAccPage {
    public void navigateNewMailPage(){
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("window.open('"+ConfigReader.getProperty("temp-mail-site")+ "')");
        ReusableMethods.wait(3);


    }
    public void selectCountry(String country){
        click(registerCountryDropdown);
        int i=0;
        while (i<registerCountryList.size() ){
            if (registerCountryList.get(i).getText().equals(country)) {
                click(registerCountryList.get(i));
                i=registerCountryList.size();
            }
            else
                i++;
        }
    }
    public void pageDownAndAccept(){
        click(iFrame);
        pageAllDown();
        ReusableMethods.wait(1);
        pageUp();
        click(readAndAcceptButton);
    }
    public  void checkMailMessage(){
        Assert.assertEquals(ConfigReader.getProperty("mail-verification-message"), checkMailForVerifyMessage.getText());
    }
}
