package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import report.TestLogger;

public class ServicePOM extends CommonAPI {

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-3']")
    public static WebElement services;


    public void movemouse() {
        Actions actions = new Actions(driver);
        actions.moveToElement(services).build().perform();

    }

    public void clickOnOnLineBanking() {
        clickOnElementByXpath("//ul[@class='td-dropdown-content']//a[contains(text(),'Online Banking')]");
        TestLogger.log("Online Banking clicked");
    }

    public void clickStudentBanking() {
        clickOnElementByXpath("//ul[@class='td-dropdown-content']//a[contains(text(),'Student Banking')]");
        TestLogger.log("Student Banking Clicked");
    }

    public void clickOnCrossBorder() {
        clickOnElementByXpath("//ul[@class='td-dropdown-content']//a[contains(text(),'Cross Border')]");
        TestLogger.log("Cross Border button clicked");
    }

    public void clickOnTravelTips() {
        clickOnElementByXpath("//ul[@class='td-dropdown-content']//a[contains(text(),'Travel Tips')]");
        TestLogger.log("Travel Tips Button clicked");
    }

    public void clickOnForeignExchangeServices() {
        clickOnElementByXpath("//ul[@class='td-dropdown-content']//a[contains(text(),'Foreign Exchange Services')]");
        TestLogger.log("Foreign Exchange Services clicked");
    }

    public void clickOnOverdraftServices() {
        clickOnElementByXpath("//ul[@class='td-dropdown-content']//a[contains(text(),'Overdraft Services')]");
        TestLogger.log("OverdraftServices clicked");
    }

    public void clickOnNewToTdChecking() {
        clickOnElementByXpath("//ul[@class='td-dropdown-content']//a[contains(text(),'New to TD Checking')]");
        TestLogger.log("New to Td Checking clicked");
    }

    public void clickOnUnExpectedlyHuman() {
        clickOnElementByXpath("//ul[@class='td-dropdown-content']//a[contains(text(),'Unexpectedly Human')]");
        TestLogger.log("Unexpectedly Human Button clicked");
    }
}