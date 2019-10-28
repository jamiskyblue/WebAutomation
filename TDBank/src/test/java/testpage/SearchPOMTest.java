package testpage;

import POM.SearchPOM;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPOMTest extends CommonAPI {

    SearchPOM searchPOM;

    @BeforeMethod
    public void getSearchTest() {
        searchPOM = PageFactory.initElements(driver, SearchPOM.class);
    }

    @Test
    public void setSearchTest() {
        searchPOM.validateSearchButtonClick();
        sleepFor(3);
        searchPOM.validateSearchButtonType();
        sleepFor(3);


    }
}