package test.java.selenium.tests;


import io.qameta.allure.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import pages.*;
import step.definitions.ScreenshotOnFailure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Epic(" Java - Miniproject")
@Feature("nopCommerce Test Scenarios")

public class LogintTest extends ScreenshotOnFailure {

    private static String email = "dorontinaperfundi@yahoo.com";
    LoginPage loginPage;
    MainPage mainPage;
    RegisterPage registerPage;
    RegisterSuccess registerSuccess;
    NotebooksPage notebooksPage;
    ShoppingCartPage shoppingCartPage;
    private String password = "Gezim1997!";

    @Test
    @Step
    @Severity(SeverityLevel.NORMAL)
    @Order(2)
    @Description("Login Test")
    public void loginTest() {
        //1.Navigate to : https://demo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");
        //2.Click LogIn - Menu
        mainPage = new MainPage(driver);
        mainPage.clickOnLoginLink();
        //3.	Login with the credentials created from Test 1
        loginPage = new LoginPage(driver);
        loginPage.login(email, password);
        //4.Verify that login is successful:   -“Welcome to our store text” - is displayed    -Log out - Menu is displayed
        assertEquals(mainPage.getWelcomeMessage(), "Welcome to our store");
        assertTrue(mainPage.isLogoutVisible());
        //5.	Log out is implemented in the last testCase
    }
}