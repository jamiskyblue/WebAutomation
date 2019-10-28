package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class HomePOM extends CommonAPI {

    @FindBy(xpath = "//button[@class='td-button td-button-secondary td-button-large td-copy-nowrap loginout']")
    public static WebElement login;

    @FindBy(xpath = "//input[@id='formElement_0']")
    public static WebElement userName;

    @FindBy(xpath = "//input[@id='formElement_1']")
    public static WebElement passWord;

    @FindBy(xpath = "//label[@class='ng-binding card']")
    public static WebElement rememberMe;

    @FindBy(xpath = "//span[contains(text(),'Forgot user name and/or password?')]")
    public static WebElement forgotUserNamePwd;

    @FindBy(xpath = "//button[contains(text(),'I forgot my password')]")
    public static WebElement forgotPassword;


    public void validateLoginClickAble() {
        login.click();
        //  Assert.assertEquals(login.isDisplayed(),true);

    }

    public void validateUserNameTypeAble() {
        userName.sendKeys("Arif");
        Assert.assertEquals(userName.isDisplayed(), true);
        TestLogger.log("user name typed");
    }

    public void validatePassWordTypeAble() {
        passWord.sendKeys("123456");
        Assert.assertEquals(passWord.isDisplayed(), true);
        TestLogger.log("password typed");
    }

    public void validateRememberMeButton() {
        rememberMe.click();
        TestLogger.log("remember me button clicked");
    }

    public void validateForgotUserNamePwd() {
        forgotUserNamePwd.click();
        TestLogger.log("forgot user name pwd clicked");
    }

    public void validateForgotPassword() {
        forgotPassword.click();

    }
}