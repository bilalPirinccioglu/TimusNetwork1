package utilities.pageMethods;

import org.junit.Assert;
import pages.LoginPage;

public class LoginPageMethods extends LoginPage {
    public  void checkName(String firstName, String lastName){
        profileBtn.click();
        Assert.assertEquals(userName.getText(),(firstName + " " + lastName));
    }
}
