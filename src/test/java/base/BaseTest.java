package base;

import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({AllureTestNg.class})
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();

        driver.get(configReader.get("baseUrl"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}