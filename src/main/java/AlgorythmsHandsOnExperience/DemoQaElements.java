package AlgorythmsHandsOnExperience;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoQaElements extends DemoQaBase {

    public WebElement we;

    public DemoQaElements(WebDriver driver) {
        super(driver);
    }

    private static String demoQaElementsUrl = "https://demoqa.com/elements/";
    private static String demoQaElementsTextBoxUrl =  "https://demoqa.com/text-box";

    //cssSelector
    private By mainLabelCss = By.cssSelector("#app .body-height > .container.playgound-body > .pattern-backgound.playgound-header > .main-header");
    private By selectInvitePickElementLabelCss = By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6");
    private By footerTextCss = By.cssSelector("#app > footer > span");

    private By contentElementsCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(1) > span > div > div.header-text");
    private By contentFormsCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(2) > span > div > div.header-text");
    private By contentAlertsCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(3) > span > div > div.header-text");
    private By contentWidgetsCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(4) > span > div > div.header-text");
    private By contentInteractionsCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(5) > span > div > div.header-text");
    private By contentBookCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(6) > span > div > div.header-text");

    private By btnFormsCss = By.cssSelector( "#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(2) > span > div");
    private By btnAlertsCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(3) > span > div");
    private By btnWidgetsCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(4) > span > div");
    private By btnInteractionsCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(5) > span > div");
    private By btnBookCss = By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(6) > span > div");

    private By subContentElemTextBoxCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(1) > span");
    private By subContentElemCheckBoxCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(2) > span");
    private By subContentElemRadioBtnCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(3) > span");
    private By subContentElemWebTablesCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(4) > span");
    private By subContentElemButtonsCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(5) > span");
    private By subContentElemLinksCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(6) > span");
    private By subContentElemBrokenCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(7) > span");
    private By subContentElemUploadCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(8) > span");
    private By subContentElemDynamicCss = By.cssSelector("div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(9) > span");

    private By subContentFormsPracticeCss = By.cssSelector("div:nth-child(2) > div > ul > #item-0 > span");

    private By subContentAlertsBrowserCss = By.cssSelector("div:nth-child(3) > div > ul > li:nth-child(1)");
    private By subContentAlertsAlertsCss = By.cssSelector("div:nth-child(3) > div > ul > li:nth-child(2)");
    private By subContentAlertsFramesCss = By.cssSelector("div:nth-child(3) > div > ul > li:nth-child(3)");
    private By subContentAlertsNestedCss = By.cssSelector("div:nth-child(3) > div > ul > li:nth-child(4)");
    private By subContentAlertsModalCss = By.cssSelector("div:nth-child(3) > div > ul > li:nth-child(5)");

    private By elementMenuOpenClosedElementsCss = By.cssSelector("div:nth-child(1) > span > div > div.header-right > div.icon > svg > g > path:nth-child(2)");
    private By elementMenuOpenClosedFormsCss = By.cssSelector("div:nth-child(2) > span > div > div.header-right > div.icon > svg > g > path:nth-child(2)");
    private By elementMenuOpenClosedAlertsCss = By.cssSelector("div:nth-child(3) > span > div > div.header-right > div.icon > svg > g > path:nth-child(2)");
    private By elementMenuOpenClosedWidgetsCss = By.cssSelector("div:nth-child(4) > span > div > div.header-right > div.icon > svg > g > path:nth-child(2)");
    private By elementMenuOpenClosedInteractionsCss = By.cssSelector("div:nth-child(5) > span > div > div.header-right > div.icon > svg > g > path:nth-child(2)");
    private By elementMenuOpenClosedBookCss = By.cssSelector("div:nth-child(6) > span > div > div.header-right > div.icon > svg > g > path:nth-child(2)");

    //xpath
    private By mainLabelXpath = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By selectInvitePickElementLabelXpath = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]");
    private By footerTextXpath = By.xpath("//*footer/span");
    private By btnElemenstXpath = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]");
    private By btnFormsXpath = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[1]");
    private By btnAlertsXpath = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]");
    private By btnWidgetsXpath = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div/div[1]");
    private By btnInteractionsXpath = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div/div[1]");
    private By btnBookXpath = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/span/div/div[1]");

    private By subBtnElemTextBoxXpath = By.xpath("//div[1]/div[1]/div/ul/li[1]/span");
    private By subBtnElemCheckBoxXpath = By.xpath("//div[1]/div[1]/div/ul/li[2]/span");
    private By subBtnElemRadioBtnXpath = By.xpath("//div[1]/div[1]/div/ul/li[3]/span");
    private By subBtnElemWebTablesXpath = By.xpath("//div[1]/div[1]/div/ul/li[4]/span");
    private By subBtnElemButtonsXpath = By.xpath("//div[1]/div[1]/div/ul/li[5]/span");
    private By subBtnElemLinksXpath = By.xpath("//div[1]/div[1]/div/ul/li[6]/span");
    private By subBtnElemBrokenXpath = By.xpath("//div[1]/div[1]/div/ul/li[7]/span");
    private By subBtnElemUploadXpath = By.xpath("//div[1]/div[1]/div/ul/li[8]/span");
    private By subBtnElemDynamicXpath = By.xpath("//div[1]/div[1]/div/ul/li[9]/span");


    public DemoQaElements navigateToDemoQaElementsPage() {
        driver.navigate().to(demoQaElementsUrl);
        return new DemoQaElements(driver);
    }

    public DemoQaElementsTextBox navigateToDemoQaElementsTextBoxPage() throws InterruptedException {
        driver.navigate().to(demoQaElementsTextBoxUrl);
        Thread.sleep(3000);
        return new DemoQaElementsTextBox(driver);
    }

    public String getMainLabel() {
        we = driver.findElement(mainLabelXpath);
//         we = driver.findElement(mainLabelCssSelector);
         return we.getText();
    }

    public String getInvitePickElementLabel() {
        we = driver.findElement(selectInvitePickElementLabelXpath);
//        we = driver.findElement(selectInvitePickElementLabelCss);
        return we.getText();
    }

    public String getFooterText() {
//        we = driver.findElement(footerTextXpath);
        we = driver.findElement(footerTextCss);
        return we.getText();
    }

    public void clickOnBtnElementsCss() {
        we = driver.findElement(contentElementsCss);
        we.click();
    }

    public void clickOnBtnFormsCss() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        we = driver.findElement(btnFormsCss);
        we.click();
    }

    public void clickBtnAlertsCss() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        we = driver.findElement(btnAlertsCss);
        we.click();
    }

    public void clickBtnWidgetsCss() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200)");
        we = driver.findElement(btnWidgetsCss);
        we.click();
    }

    public void clickBtnInteractionsCss() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200)");
        we = driver.findElement(btnInteractionsCss);
        we.click();
    }

    public void clickBookCss() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1400)");
        we = driver.findElement(btnBookCss);
        we.click();
    }

    public void scrollPage(int horiz, int vert) {
    }

    public void clickOnBtnAlertsCss() {
        we = driver.findElement(contentAlertsCss);
        we.click();
    }

    public void clickOnBtnWidgetsCss() {
        we = driver.findElement(contentWidgetsCss);
        we.click();
    }

    public void clickOnBtnInteractionsCss() {
        we = driver.findElement(contentInteractionsCss);
        we.click();
    }

    public void clickOnBtnBooksCss() {
        we = driver.findElement(contentBookCss);
        we.click();
    }

    public List<String> elemBtnElementsCss() {
        List<String> buttons = new ArrayList<String>();

        we = driver.findElement(contentElementsCss);
        buttons.add(we.getText());

        we = driver.findElement(contentFormsCss);
        buttons.add(we.getText());

        we = driver.findElement(contentAlertsCss);
        buttons.add(we.getText());

        we = driver.findElement(contentWidgetsCss);
        buttons.add(we.getText());

        we = driver.findElement(contentInteractionsCss);
        buttons.add(we.getText());

        we = driver.findElement(contentBookCss);
        buttons.add(we.getText());

//        System.out.println(Arrays.toString(buttons.toArray()));

        return buttons;
    }

    public List<String> elemBtnElementsXpath() {
        List<String> buttons = new ArrayList<String>();

        we = driver.findElement(btnElemenstXpath);
        buttons.add(we.getText());

        we = driver.findElement(btnFormsXpath);
        buttons.add(we.getText());

        we = driver.findElement(btnAlertsXpath);
        buttons.add(we.getText());

        we = driver.findElement(btnWidgetsXpath);
        buttons.add(we.getText());

        we = driver.findElement(btnInteractionsXpath);
        buttons.add(we.getText());

        we = driver.findElement(btnBookXpath);
        buttons.add(we.getText());

        System.out.println("act: " + Arrays.toString(buttons.toArray()));

        return buttons;
    }

    public List<String> elemSubBtnElementsCss() {
        List<String> subBtn = new ArrayList<String>();

        we = driver.findElement(subContentElemTextBoxCss);
        subBtn.add(we.getText());

        we = driver.findElement(subContentElemCheckBoxCss);
        subBtn.add(we.getText());

        we = driver.findElement(subContentElemRadioBtnCss);
        subBtn.add(we.getText());

        we = driver.findElement(subContentElemWebTablesCss);
        subBtn.add(we.getText());

        we = driver.findElement(subContentElemButtonsCss);
        subBtn.add(we.getText());

        we = driver.findElement(subContentElemLinksCss);
        subBtn.add(we.getText());

        we = driver.findElement(subContentElemBrokenCss);
        subBtn.add(we.getText());

        we = driver.findElement(subContentElemUploadCss);
        subBtn.add(we.getText());

        we = driver.findElement(subContentElemDynamicCss);
        subBtn.add(we.getText());

        System.out.println("act: " + Arrays.toString(subBtn.toArray()));
        return subBtn;
    }

    public List<String> elemSubBtnElementsXpath() {
        List<String> subBtn = new ArrayList<String>();

        we = driver.findElement(subBtnElemTextBoxXpath);
        subBtn.add(we.getText());

        we = driver.findElement(subBtnElemCheckBoxXpath);
        subBtn.add(we.getText());

        we = driver.findElement(subBtnElemRadioBtnXpath);
        subBtn.add(we.getText());

        we = driver.findElement(subBtnElemWebTablesXpath);
        subBtn.add(we.getText());

        we = driver.findElement(subBtnElemButtonsXpath);
        subBtn.add(we.getText());

        we = driver.findElement(subBtnElemLinksXpath);
        subBtn.add(we.getText());

        we = driver.findElement(subBtnElemBrokenXpath);
        subBtn.add(we.getText());

        we = driver.findElement(subBtnElemUploadXpath);
        subBtn.add(we.getText());

        we = driver.findElement(subBtnElemDynamicXpath);
        subBtn.add(we.getText());

        System.out.println("act: " + Arrays.toString(subBtn.toArray()));
        return subBtn;
    }

    public List<String> elemSubBtnFormsCss() {
        List<String> subBtnForms = new ArrayList<String>();

        we = driver.findElement(subContentFormsPracticeCss);
        subBtnForms.add(we.getText());

        System.out.println("act: " + Arrays.toString(subBtnForms.toArray()));

        return subBtnForms;
    }

    public List<String> elemSubBtnAlertsCss() {
        List<String> subBtnAlerts = new ArrayList<String>();

        we = driver.findElement(subContentAlertsBrowserCss);
        subBtnAlerts.add(we.getText());

        we = driver.findElement(subContentAlertsAlertsCss);
        subBtnAlerts.add(we.getText());

        we = driver.findElement(subContentAlertsFramesCss);
        subBtnAlerts.add(we.getText());

        we = driver.findElement(subContentAlertsNestedCss);
        subBtnAlerts.add(we.getText());

        we = driver.findElement(subContentAlertsModalCss);
        subBtnAlerts.add(we.getText());

        System.out.println("act: " + Arrays.toString(subBtnAlerts.toArray()));
        return subBtnAlerts;
    }

    public List<String> elemSubBtnAlertsXpath() {
        List<String> subBtnAlerts = new ArrayList<String>();

        we = driver.findElement(subContentAlertsBrowserCss);
        subBtnAlerts.add(we.getText());

        we = driver.findElement(subContentAlertsAlertsCss);
        subBtnAlerts.add(we.getText());

        we = driver.findElement(subContentAlertsFramesCss);
        subBtnAlerts.add(we.getText());

        we = driver.findElement(subContentAlertsNestedCss);
        subBtnAlerts.add(we.getText());

        we = driver.findElement(subContentAlertsModalCss);
        subBtnAlerts.add(we.getText());

        System.out.println("act: " + Arrays.toString(subBtnAlerts.toArray()));
        return subBtnAlerts;
    }

    public boolean[] isElementBtnOpenElements() {

        boolean[] openClosedElementsMenu = new boolean[6]; // open - true

        we = driver.findElement(elementMenuOpenClosedElementsCss);
        System.out.println(we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length()));
        openClosedElementsMenu[0] = (we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length())).equals("83z");

        we = driver.findElement(elementMenuOpenClosedFormsCss);
        System.out.println(we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length()));
        openClosedElementsMenu[1] = (we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length())).equals("83z");

        we = driver.findElement(elementMenuOpenClosedAlertsCss);
        System.out.println(we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length()));
        openClosedElementsMenu[2] = (we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length())).equals("83z");

        we = driver.findElement(elementMenuOpenClosedWidgetsCss);
        System.out.println(we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length()));
        openClosedElementsMenu[3] = (we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length())).equals("83z");

        we = driver.findElement(elementMenuOpenClosedInteractionsCss);
        System.out.println(we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length()));
        openClosedElementsMenu[4] = (we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length())).equals("83z");

        we = driver.findElement(elementMenuOpenClosedBookCss);
        System.out.println(we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length()));
        openClosedElementsMenu[5] = (we.getAttribute("d").substring(we.getAttribute("d").length()-3, we.getAttribute("d").length())).equals("83z");

        System.out.println(Arrays.toString(openClosedElementsMenu));
        return openClosedElementsMenu;
    }


}
