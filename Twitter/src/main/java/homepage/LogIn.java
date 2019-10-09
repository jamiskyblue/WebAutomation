package homepage;

import base.CommonAPI;

public class LogIn extends CommonAPI {
    public void loginbuttonisDisplayed() {
        // boolean condition= isElementDisplayed("//a[@class='StaticLoggedOutHomePage-input StaticLoggedOutHomePage-narrowLoginButton EdgeButton EdgeButton--secondary EdgeButton--small u-floatRight']");
        //Assert.assertEquals(isElementDisplayed(//a[@class='StaticLoggedOutHomePage-input StaticLoggedOutHomePage-narrowLoginButton EdgeButton EdgeButton--secondary EdgeButton--small u-floatRight'],true));
        clickOnElementByXpath("//a[@class='StaticLoggedOutHomePage-input StaticLoggedOutHomePage-narrowLoginButton EdgeButton EdgeButton--secondary EdgeButton--small u-floatRight']");

    }
}




