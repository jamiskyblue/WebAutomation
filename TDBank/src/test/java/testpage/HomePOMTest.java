package testpage;

import POM.HomePOM;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePOMTest extends CommonAPI {

    @Test
    public void loginTest() {
        HomePOM homePOM = PageFactory.initElements(driver, HomePOM.class);
        homePOM.validateLoginClickAble();
        homePOM.validateUserNameTypeAble();
        homePOM.validatePassWordTypeAble();
        sleepFor(5);
        homePOM.validateRememberMeButton();
        homePOM.validateForgotUserNamePwd();
        sleepFor(3);
        homePOM.validateForgotPassword();


    }


}