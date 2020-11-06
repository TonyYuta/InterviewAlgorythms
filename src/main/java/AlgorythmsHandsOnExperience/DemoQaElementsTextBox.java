package AlgorythmsHandsOnExperience;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class DemoQaElementsTextBox extends DemoQaBase {

    public WebElement we;

    public DemoQaElementsTextBox(WebDriver driver) {
        super(driver);
    }

    private static String demoQaElementsUrl = "https://demoqa.com/elements/";
    private static String demoQaElementsTextBoxUrl =  "https://demoqa.com/elements/text-box";

    // id
    private By fullNameLabelId = By.id("userName-label");
    private By userEmailLabelId = By.id("userEmail-label");
    private By currentAddressLabelId = By.id("currentAddress-label");
    private By permanentAddressLabelId = By.id("permanentAddress-label");
    private By fullNameTextBoxId = By.id("userName");
    private By userEmailTextBoxId = By.id("userEmail");
    private By currentAddressTextBoxId = By.id("currentAddress");
    private By permanentAddressTextBoxId = By.id("permanentAddress");
    private By submitBtnId = By.id("submit");

    // cssSelector
    private By fullNameLabelCss = By.cssSelector("#userName-label");
    private By userEmailLabelCss = By.cssSelector("#userEmail-label");
    private By currentAddressLabelCss = By.cssSelector("#currentAddress-label");
    private By permanentAddressLabelCss = By.cssSelector("#permanentAddress-label");
    private By fullNameTextBoxCss = By.cssSelector("#userName");
    private By userEmailTextBoxCss = By.id("#userEmail");
    private By currentAddressTextBoxCss = By.xpath("#currentAddress");
    private By permanentAddressTextBoxCss = By.xpath("#permanentAddress");
    private By submitBtnCss = By.cssSelector("#submit");
    private By outputNameLabelCss = By.cssSelector("#output > div > #name");
    private By outputEmailLabelCss = By.cssSelector("#output > div > #email");
    private By outputCurrentAddressLabelCss = By.cssSelector("#output > div > #currentAddress");
    private By outputPermanentAddressLabelCss = By.cssSelector("#output > div > #permanentAddress");

    // xpath
    private By fullNameLabelXpath = By.xpath("//*[@id=\"userName-label\"]");
    private By userEmailLabelXpath = By.xpath("//*[@id=\"userEmail-label\"]");
    private By currentAddressLabelXpath = By.xpath("//*[@id=\"currentAddress-label\"]");
    private By permanentAddressLabelXpath = By.xpath("//*[@id=\"permanentAddress-label\"]");
    private By fullNameTextBoxXpath = By.xpath("//*[@id=\"userName\"]");
    private By userEmailTextBoxXpath = By.xpath("//*[@id=\"userEmail\"]");
    private By currentAddressTextBoxXpath = By.xpath("//*[@id=\"currentAddress\"]");
    private By permanentAddressTextBoxXpath = By.xpath("//*[@id=\"permanentAddress\"]");
    private By submitBtnXpath = By.xpath("//*[@id=\"submit\"]");
    private By outputNameLabelXpath = By.xpath("//*[@id=\"output\"]/div/*[@id=\"name\"]");
    private By outputEmailLabelXpath = By.xpath("//*[@id=\"output\"]/div/*[@id=\"email\"]");
    private By outputCurrentAddressLabelXpath = By.xpath("//*[@id=\"output\"]/div/*[@id=\"currentAddress\"]");
    private By outputPermanentAddressLabelXpath = By.xpath("//*[@id=\"output\"]/div/*[@id=\"permanentAddress\"]");

    public void fillOutFullNameId(String fullName) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1200)");

        we = driver.findElement(fullNameTextBoxId);
        we.sendKeys(fullName);
    }

    public void fillOutFullNameCss(String fullName) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1200)");

        we = driver.findElement(fullNameTextBoxCss);
        we.sendKeys(fullName);
    }

    public void fillOutUserEmailId(String userEmail) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1200)");

        we = driver.findElement(userEmailTextBoxId);
        we.sendKeys(userEmail);
    }

    public void fillOutUserEmailCss(String userEmail) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1200)");

        we = driver.findElement(userEmailTextBoxCss);
        we.sendKeys(userEmail);
    }

    public void fillOutCurrentAddressTextBoxId(String currentAddress) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1200)");

        we = driver.findElement(currentAddressTextBoxId);
        we.sendKeys(currentAddress);
    }

    public void fillOutCurrentAddressTextBoxCss(String currentAddress) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1200)");

        we = driver.findElement(currentAddressTextBoxCss);
        we.sendKeys(currentAddress);
    }

    public void fillOutPermanentAddressTextBoxId(String permanentAddress) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1200)");

        we = driver.findElement(permanentAddressTextBoxId);
        we.sendKeys(permanentAddress);
    }

    public void fillOutPermanentAddressTextBoxCss(String permanentAddress) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1200)");

        we = driver.findElement(permanentAddressTextBoxCss);
        we.sendKeys(permanentAddress);
    }

    public Map clickSubmitBtnId() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");
        Thread.sleep(2000);

        we = driver.findElement(submitBtnId);
        we.click();
        Thread.sleep(2000);

        Map<String, String> output = new HashMap<String, String>();

        js.executeScript("window.scrollBy(0, 400)");

        we = driver.findElement(outputNameLabelCss);
        output.put("outputNameLabel", we.getText());

        we = driver.findElement(outputEmailLabelCss);
        output.put("outputEmailLabel", we.getText());

        we = driver.findElement(outputCurrentAddressLabelCss);
        output.put("outputCurrentAddressLabel", we.getText());

        we = driver.findElement(outputPermanentAddressLabelCss);
        output.put("outputPermanentAddressLabel", we.getText());

        return output;
    }

    public Map clickSubmitBtnCss() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");

        we = driver.findElement(submitBtnCss);
        we.click();
        Thread.sleep(1000);

        js.executeScript("window.scrollBy(0, 400)");

        Map<String, String> output = new HashMap<String, String>();

        we = driver.findElement(outputNameLabelCss);
        output.put("outputNameLabel", we.getText());

        we = driver.findElement(outputEmailLabelCss);
        output.put("outputEmailLabel", we.getText());

        we = driver.findElement(outputCurrentAddressLabelCss);
        output.put("outputCurrentAddressLabel", we.getText());

        we = driver.findElement(outputPermanentAddressLabelCss);
        output.put("outputPermanentAddressLabel", we.getText());

        return output;
    }
    
    public Map clickSubmitBtnXpath() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");

        we.findElement(submitBtnXpath);
        we.click();
        Thread.sleep(1000);

//        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");
        Map<String, String> output = new HashMap<String, String>();
        
        we.findElement(outputNameLabelXpath);
        output.put("outputNameLabel", we.getText());
        
        we.findElement(outputEmailLabelXpath);
        output.put("outputEmailLabel", we.getText());
        
        we.findElement(outputCurrentAddressLabelXpath);
        output.put("outputCurrentAddressLabel", we.getText());
        
        we.findElement(outputPermanentAddressLabelXpath);
        output.put("outputPermanentAddressLabel", we.getText());

        return output;
    }
}
