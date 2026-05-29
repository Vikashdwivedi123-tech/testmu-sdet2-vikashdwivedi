package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver){
        this.driver=driver;
    }

    By addButton = By.id("addNewRecordButton");

    By searchBox = By.id("APjFqb");

    By registration = By.id("registration-form-modal");

    By pageText = By.xpath("//strong[normalize-space()='1 of 1']");

    By firstRow = By.xpath("//tbody/tr[1]/td");

    public void clickOnAdd(){
        driver.findElement(addButton).click();
    }

    public boolean isHeadingVisible(){
        return driver.findElement(registration).isDisplayed();
    }

    public void enterSearch(String text) {
        driver.findElement(searchBox).sendKeys(text);
    }

    public String getTitle(){
        String actual = driver.getTitle();
        return actual;
    }

    public boolean verifyPageText(){
        return driver.findElement(pageText).isDisplayed();
    }

    public String fetchFirstRowText(){
        String text = driver.findElement(firstRow).getText();
        return text;
    }

    public List<String> getFirstRowData(){
        List<WebElement> cells = driver.findElements(firstRow);
        List<String> actualData = new ArrayList<>();
        for(WebElement cell : cells) {
            String text = cell.getText().trim();

            if (!text.isEmpty()) {
                actualData.add(text);
            }

        }
        return actualData;
    }
}
