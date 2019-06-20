package pom.bbcsite.BbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BbcRegisterPage {

    private static WebDriver driver;

    //Page Identifiers
    private String RegisterPageURL = "https://account.bbc.com/register?context=HOMEPAGE&nonce=xShPUyym--1Io7LPhT3Qs9QKJBy_ZJTnEiQc&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F&userOrigin=HOMEPAGE_PS";
    private By over13Button = By.cssSelector("a[aria-label='13 or over']");
    private By under13Button = By.cssSelector("a[aria-label='Under 13]");
    private By dayField = By.id("day-input");
    private By monthField = By.id("month-input");
    private By yearField = By.id("year-input");
    private By continueButton = By.id("submit-button");
    private By emailField = By.id("user-identifier-input");
    private By passwordField = By.id("password-input");
    private By genderField = By.id("gender-input");
    private By postCodeField = By.id("postcode-input");
    private By passwordErrorMessage = By.id("form-message-password");

    public BbcRegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToRegisterPage(){
        driver.navigate().to(RegisterPageURL);
    }


    //Over 13 Navigation
    public void clickOver13Button(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(over13Button)).click().build().perform();
        //driver.findElement(over13Button).click();
    }
    public void inputDay(String day){
        driver.findElement(dayField).sendKeys(day);
    }
    public void inputMonth(String month){
        driver.findElement(monthField).sendKeys(month);
    }
    public void inputYear(String year){
        driver.findElement(yearField).sendKeys(year);
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public void inputEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void inputPostCode(String postCode){
        driver.findElement(postCodeField).sendKeys(postCode);
    }
    public void selectGender(String gender){
        Select genderType = new Select(driver.findElement(genderField));
        genderType.selectByVisibleText(gender);
    }
    public String getPasswordErrorText(){
        return driver.findElement(passwordErrorMessage).getText();
    }

    //Under 13 Navigation
    public void clickUnder13Button(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(under13Button)).click().build().perform();
    }


}
