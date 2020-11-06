package AlgorythmsHandsOnExperience;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQaElementsCheckBox extends DemoQaBase {

    public DemoQaElementsCheckBox(WebDriver driver) {
        super(driver);
    }

    private static String demoQaElementsUrl = "https://demoqa.com/elements/";
    private static String demoQaElementsCheckBoxUrl =  "https://demoqa.com/elements/checkbox";

    // id
    private By homeCheckBoxId = By.id("");

    // cssSelector
    private By plusBtnCss = By.cssSelector("#tree-node > div > button:nth-child(1) > svg");
    private By minusBtnCss = By.cssSelector("#tree-node > div > button:nth-child(2) > svg");
    private By homeCheckBoxCss= By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg");

    // xpath
    private By plusBtnXpath = By.xpath("//*[@id=\"tree-node\"]/div/button[1]");
    private By minusBtnXpath = By.xpath("//*[@id=\"tree-node\"]/div/button[2]");
    private By homeCheckBoxXpath = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]/svg");




}
