package by.p7745.tests;

import by.p7745.driver.Driver;
import by.p7745.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeTest {
    private HomePage homePage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlert() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieAlertClose();
    }

    @Test
    public void testBasket() {
        Assertions.assertEquals(homePage.OFFERS_LABEL, homePage.getOffersButtonText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }


}
