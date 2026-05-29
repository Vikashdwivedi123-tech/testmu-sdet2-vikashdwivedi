package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginPage;

import java.util.Arrays;
import java.util.List;

public class loginTest extends BaseTest {

    @Test
    public void verifytabledata(){
       loginPage login = new loginPage(driver);
       login.verifyPageText();
       login.clickOnAdd();
       login.isHeadingVisible();
        List<String> expectedData = Arrays.asList(
                "Cierra",
                "Vega",
                "39",
                "cierra@example.com",
                "10000",
                "Insurance"
        );
       Assert.assertEquals(login.getFirstRowData(),expectedData);
       Assert.assertEquals(login.getTitle(),"demosite");
    }


//    public void verifyTitle() {
//        loginPage login = new loginPage(driver);
//        login.enterSearch("youtube");
//        Assert.assertEquals(login.getTitle(), "Google");
//
//    }
}