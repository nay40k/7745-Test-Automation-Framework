package by.p7745.pages;

import by.p7745.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final String BASE_URL = "https://7745.by/";
    private final String PAYMENT_ENDPOINT = "payment/prepayment";
    private final String SERVICES_ENDPOINT = "catalog/uslugi";
    public final String OFFERS_LABEL = "Акции";


    private final By COOKIE_ALERT_CLOSE = By.xpath("//*[@id='gdprAccept']");
    private final By OFFERS_BUTTON = By.xpath("//*[@id='panel']/div[1]/div[1]/div/ul/li[7]/a");


    private WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void clickCookieAlertClose() {
        driver.findElement(COOKIE_ALERT_CLOSE).click();
    }

    public String getOffersButtonText() {
        return driver.findElement(OFFERS_BUTTON).getText();
    }

}
