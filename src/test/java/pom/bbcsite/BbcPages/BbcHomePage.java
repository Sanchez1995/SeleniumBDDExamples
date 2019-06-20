package pom.bbcsite.BbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcHomePage {

    private static WebDriver driver;

    //Page Identifiers
    private String HomePageURL = "https://www.bbc.co.uk/";
    private By signInLinkID = By.id("idcta-username");

    //*[@id="orb-modules"]/div[2]/section[2]/div/div/p[2]/a[1]



    //pages
    public BbcHomePage(WebDriver driver){
        this.driver = driver;
    }


    //Page Actions
    public void goToHomePage(){
        driver.navigate().to(HomePageURL);
    }

    public void clickSignInLink(){
        driver.findElement(signInLinkID).click();
    }


}
