package AlgorythmsHandsOnExperience;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoQaBaseTest {

    public WebDriver driver;

    DemoQaElements e;
    DemoQaAlerts a;
    DemoQaBook b;
    DemoQaForms f;
    DemoQaInteractions i;
    DemoQaWidgets w;

    DemoQaElementsTextBox etb;

    ArrayList<String> al;
    HashSet<String> hs;

    /**
     * @param browser
     * @param appURL
     */
    @Parameters({ "browser", "appURL", "groups" })
    @BeforeClass(alwaysRun = true)
    public void initializeTestBaseSetup(String browser, String appURL, String groups) {
        try {
            DriverFactory.setDriver(browser, appURL, groups);

        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
        driver = DriverFactory.getDriver();

        e = new DemoQaElements(driver);
        b = new DemoQaBook(driver);
        a = new DemoQaAlerts(driver);
        f = new DemoQaForms(driver);
        i = new DemoQaInteractions(driver);
        w = new DemoQaWidgets(driver);

        etb = new DemoQaElementsTextBox(driver);
    }


    @AfterClass(enabled = true, alwaysRun = true)
    public void afterClassTearDown() {
        //driver.close();
        driver.quit();
    }




}