import base.CommonAPI;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {
    @Test
    public void openBrowser() {
        sleepFor(2);
        cleanUp();
    }
}
