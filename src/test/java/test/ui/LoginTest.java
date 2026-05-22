package test.ui;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import pages.loginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @DataProvider(name = "getTestData")
    public Object[][] getLoginData() {
        return new Object[][] {
                {"Admin", "admin123"},
                {"Admin", "wrongPassword"}
        };
    }
    @Test(dataProvider = "getTestData")
    public void verifyLogin(String username, String password) {

        loginPage login = new loginPage(driver);
        login.login(username, password);
    }
}