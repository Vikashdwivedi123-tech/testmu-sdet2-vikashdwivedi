package test.ui;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import pages.loginPage;
import org.testng.annotations.Test;
@Epic("Login Module")
@Feature("User Login")
public class LoginTest extends BaseTest {


    @DataProvider(name = "getTestData")
    public Object[][] getLoginData() {
        return new Object[][] {
                {"Admin", "admin123"}
        };
    }
    @Test(dataProvider = "getTestData")
    @Story("Verify login functionality with valid and invalid credentials")
    @Description("This test verifies login functionality for multiple user scenarios")
    public void verifyLogin(String username, String password) {
        loginPage login = new loginPage(driver);
        login.login(username, password);
    }
}