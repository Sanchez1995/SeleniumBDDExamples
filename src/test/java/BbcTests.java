import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pom.bbcsite.BbcSite;

public class BbcTests {

    static BbcSite bbcSite = new BbcSite( DriverUtilities.getInstanceOfDriverUtilities().getDriver());

    @Test
    public void debugger(){
        bbcSite.getBbcHomePage().goToHomePage();
        bbcSite.getBbcHomePage().clickSignInLink();
        bbcSite.getBbcSignInPage().goToSignInPage();
        bbcSite.getBbcRegisterPage().goToRegisterPage();

    }

    @Test
    public void testPasswordErrorMessage(){
        bbcSite.getBbcSignInPage().goToSignInPage();
        bbcSite.getBbcSignInPage().inputUserName("sanchez_e@hotmail.co.uk");
        bbcSite.getBbcSignInPage().inputPassword("12345");
        bbcSite.getBbcSignInPage().clickSubmitButton();
        Assert.assertEquals("Sorry, that password is too short. It needs to be eight characters or more.", bbcSite.getBbcSignInPage().getPasswordErrorText());
    }

    @Test
    public void testOver13RegisterError() throws InterruptedException {
        //input to decide whether 13 or under 13?
        bbcSite.getBbcRegisterPage().goToRegisterPage();
        Thread.sleep(4000);
        bbcSite.getBbcRegisterPage().clickOver13Button();
        Thread.sleep(1000);
        bbcSite.getBbcRegisterPage().inputDay("10");
        bbcSite.getBbcRegisterPage().inputMonth("08");
        bbcSite.getBbcRegisterPage().inputYear("1995");
        bbcSite.getBbcRegisterPage().clickContinueButton();
        Thread.sleep(4000);
        bbcSite.getBbcRegisterPage().inputEmail("sarbas45@gmail.com");
        bbcSite.getBbcRegisterPage().inputPassword("12345");
        bbcSite.getBbcRegisterPage().inputPostCode("w2 4jd");
        bbcSite.getBbcRegisterPage().selectGender("Other");
        Assert.assertEquals("Sorry, that password is too short. It needs to be eight characters or more.", bbcSite.getBbcRegisterPage().getPasswordErrorText());
    }
    @Test
    public void testUnder13Register(){
        bbcSite.getBbcRegisterPage().goToRegisterPage();
        bbcSite.getBbcRegisterPage().clickUnder13Button();

    }

   @AfterClass
    public static void teardown(){
        bbcSite.closeDriver();

    }

}
