package AlgorythmsHandsOnExperience;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DemoQaBase {

    protected WebElement we;
    protected WebDriver driver;

    /**
     * @param driver
     */
    public DemoQaBase(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @return
     */
    @SuppressWarnings("javadoc")
    public String currentPageTitle() {
        return driver.getTitle();
    }


}
