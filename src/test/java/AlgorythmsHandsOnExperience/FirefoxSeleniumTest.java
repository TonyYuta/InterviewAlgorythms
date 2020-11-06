package AlgorythmsHandsOnExperience;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirefoxSeleniumTest {

    FirefoxSelenium ff = new FirefoxSelenium();

    @BeforeMethod(alwaysRun = true)
    public void setUpDriverBeforeMethod() {
        ff.cap =  DesiredCapabilities.firefox();
        ff.cap.setCapability("marionette", true);
        ff.options = new FirefoxOptions();
        ff.options.setHeadless(false);
        ff.driver = new FirefoxDriver(ff.options);
        ff.driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTestTearDown() {
       ff.driver.close();
//        ff.driver.quit();
    }

    @Test(enabled = true,
            description = "get Gmai lUrl",
            groups = {"Selenium", "Firefox", "Gmail"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void testGetGmailUrl() throws InterruptedException {
        String url = "https://gmail.com";
        String gmailTitle = ff.navigateToUrl(url);
        Thread.sleep(3000);
        Assert.assertEquals(gmailTitle, "Gmail", "Mismatch in Gmail title.");
    }

    @Test(enabled = true,
    description = "navigate to yahoo.com",
    groups = {"Selenium", "Firefox", "Yahoo"},
    dependsOnGroups = {},
    dependsOnMethods = {},
    priority = 0)
    public void testYahoo() {
        String url = "https://yahoo.com";
        Assert.assertEquals(ff.navigateToUrl(url), "Yahoo", "Mismatch in Yahoo title");
    }

    @Test(enabled = true,
    description = "navigate to any url",
    groups = {"bat", "regression", "Selenium"},
    dependsOnGroups = {},
    dependsOnMethods = {},
    priority = 0)
    public void testNavigateToUrl() {
        String yahooTitle = ff.navigateToUrl("https://yahoo.com");
        Assert.assertEquals(yahooTitle, "Yahoo"," mismatch in Yahoo title");
    }

}
