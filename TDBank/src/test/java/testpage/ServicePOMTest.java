package testpage;

import POM.ServicePOM;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ServicePOMTest extends CommonAPI {

    ServicePOM servicePOM;

    @BeforeMethod
    public void getserviceTest() {
        servicePOM = PageFactory.initElements(driver, ServicePOM.class);
    }

    @Test
    public void setServicePOM() {
        servicePOM.movemouse();
        sleepFor(3);
        servicePOM.clickOnOnLineBanking();
        driver.navigate().back();
        sleepFor(3);

        servicePOM.movemouse();
        servicePOM.clickStudentBanking();
        sleepFor(3);
        driver.navigate().back();

        servicePOM.movemouse();
        servicePOM.clickOnCrossBorder();
        sleepFor(3);
        driver.navigate().back();

        servicePOM.movemouse();
        servicePOM.clickOnTravelTips();
        sleepFor(3);
        driver.navigate().back();

        servicePOM.movemouse();
        servicePOM.clickOnForeignExchangeServices();
        sleepFor(3);
        driver.navigate().back();

        servicePOM.movemouse();
        servicePOM.clickOnOverdraftServices();
        sleepFor(3);
        driver.navigate().back();

        servicePOM.movemouse();
        servicePOM.clickOnNewToTdChecking();
        sleepFor(3);
        driver.navigate().back();

        servicePOM.movemouse();
        servicePOM.clickOnUnExpectedlyHuman();
        sleepFor(3);
        driver.navigate().back();
        sleepFor(3);


    }
}
