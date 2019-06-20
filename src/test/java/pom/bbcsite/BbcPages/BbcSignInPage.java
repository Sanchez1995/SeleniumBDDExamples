package pom.bbcsite.BbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcSignInPage {

    private static WebDriver driver;

    // page identifiers

    private String BbcSignInPageURL = "https://account.bbc.com/signin";
    private By usernameFieldID = By.id("user-identifier-input");
    private By passwordFieldID = By.id("password-input");
    private By submitButton = By.id("submit-button");
    private By passwordErrorMessage = By.id("form-message-password");

    public BbcSignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToSignInPage(){
        driver.navigate().to(BbcSignInPageURL);
    }

    public void inputUserName(String name){
        driver.findElement(usernameFieldID).sendKeys(name);
    }

    public void  inputPassword(String password){
        driver.findElement(passwordFieldID).sendKeys(password);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public String getPasswordErrorText(){
        return driver.findElement(passwordErrorMessage).getText();
    }
}
