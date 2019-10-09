package homepagetests;

import homepage.LogIn;
import org.testng.annotations.Test;

public class LogInTest extends LogIn {
    @Test
    public void clickAbilityTestForLogInButton() {
        loginbuttonisDisplayed();
    }
}
