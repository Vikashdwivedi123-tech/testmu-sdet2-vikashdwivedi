package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.waitUtils;

import java.time.Duration;

public class loginPage {

    private WebDriver driver;

    // Constructor
    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new waitUtils(driver);

    }

    // Locators
    private By username = By.xpath("//input[@name='username']");
    private By password = By.xpath("//input[@name='password']");
    private By loginBtn = By.xpath("//button[@type='submit']");



    private waitUtils waitUtils;

    // Actions
    public void enterUsername(String user) {
        waitUtils.waitForVisibility(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        waitUtils.waitForVisibility(password).sendKeys(pass);
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    // Business method (VERY IMPORTANT for interviews)
    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLoginBtn();
    }
}