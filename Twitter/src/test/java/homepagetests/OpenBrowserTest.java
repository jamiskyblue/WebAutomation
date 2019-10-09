package homepagetests;

import homepage.OpenBrowser;
import org.testng.annotations.Test;

public class OpenBrowserTest extends OpenBrowser {
    @Test
    public void opener() {
        new OpenBrowser();
    }
}
