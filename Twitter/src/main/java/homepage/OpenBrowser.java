package homepage;

import base.CommonAPI;

import static org.testng.Assert.assertEquals;

public class OpenBrowser extends CommonAPI {
    public void Openerbrowser() {
        boolean condition = isElementDisplayed("https://www.twitter.com");
        assertEquals(condition, true);
    }
}
