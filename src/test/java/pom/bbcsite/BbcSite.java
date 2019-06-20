package pom.bbcsite;

import org.openqa.selenium.WebDriver;
import pom.bbcsite.BbcPages.BbcHomePage;
import pom.bbcsite.BbcPages.BbcRegisterPage;
import pom.bbcsite.BbcPages.BbcSignInPage;

public class BbcSite {

    static WebDriver driver;
    BbcHomePage bbcHomePage;
    BbcSignInPage bbcSignInPage;
    BbcRegisterPage bbcRegisterPage;

    public BbcSite(WebDriver driver){
        this.driver = driver;
        bbcHomePage = new BbcHomePage(driver);
        bbcSignInPage = new BbcSignInPage(driver);
        bbcRegisterPage = new BbcRegisterPage(driver);

    }

    public BbcHomePage getBbcHomePage(){
        return bbcHomePage;
    }

    public BbcSignInPage getBbcSignInPage(){
        return bbcSignInPage;
    }

    public BbcRegisterPage getBbcRegisterPage(){
        return bbcRegisterPage;
    }

    //driver actions
    public void closeDriver(){
        driver.quit();
    }
}
