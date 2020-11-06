package AlgorythmsHandsOnExperience;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxSelenium {

    DesiredCapabilities cap;
    WebDriver driver;
    FirefoxOptions options;

    String navigateToUrl(String url) {
        driver.get(url);
        return driver.getTitle();
    }






}
