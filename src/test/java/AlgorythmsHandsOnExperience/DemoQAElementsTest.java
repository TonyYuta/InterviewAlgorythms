package AlgorythmsHandsOnExperience;

import org.testng.Assert;
import org.testng.annotations.*;
import sun.jvm.hotspot.runtime.Threads;

import java.util.Arrays;
import java.util.List;

public class DemoQAElementsTest extends DemoQaBaseTest {

    /**
     * Test all elements in Demo QA Elements Page
     */
    @Test(enabled = false,
            description = "Labels on DemoQA Elements page",
            groups = {"all", "DemoQA", "Elements", "bat", "regression", "Selenium"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0)
    public void testLabelsToDemoQaElementsPage() throws NullPointerException {
        String pageTitle = "ToolsQA";
        String mainLabel = "Elements";
        String invitePickElementLabel = "Please select an item from left to start practice.";
        String footerText = "© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.";

        e.navigateToDemoQaElementsPage();

        Assert.assertTrue(e.currentPageTitle().equals(pageTitle), "URI doesn't match to Home page");
        Assert.assertTrue(e.getMainLabel().equals(mainLabel), "mismatch in Main Label");
        Assert.assertTrue(e.getInvitePickElementLabel().equals(invitePickElementLabel),
                "mismatch in Invite Pick Element Label");
        Assert.assertEquals(e.getFooterText(), footerText, "mismatch in footer text");
    }

    @Test(enabled = false,
    description = "Buttons on Elements Page",
    groups = {"All", "Elements", "Selenium", "bat"},
    dependsOnGroups = {},
    dependsOnMethods = {},
    priority = 0)
    public void testButtonsOnElementPage() {
        List<String> buttons = Arrays.asList("Elements", "Forms", "Alerts, Frame & Windows", "Widgets", "Interactions", "Book Store Application");
        System.out.println("exp: " + Arrays.toString(buttons.toArray()));
        e.navigateToDemoQaElementsPage();
        Assert.assertEquals( e.elemBtnElementsCss(),buttons, "mismatch in buttons list (using css)");
        Assert.assertEquals( e.elemBtnElementsXpath(),buttons, "mismatch in buttons list (using xpath)");
    }

    @Test(enabled = false,
    description = "Sub buttons Elements",
    groups = {"All", "Elements", "Selenium"},
    dependsOnGroups = {},
    dependsOnMethods = {},
    priority = 0)
    public void testSubBtnElements() {
        List<String> subBtnElements = Arrays.asList("Text Box", "Check Box", "Radio Button", "Web Tables", "Buttons", "Links", "Broken Links - Images", "Upload and Download", "Dynamic Properties");
        System.out.println("exp: " + Arrays.toString(subBtnElements.toArray()));
        e.navigateToDemoQaElementsPage();
        Assert.assertEquals(e.elemSubBtnElementsCss(), subBtnElements, "mismatch in Sub buttons Elements (using css)");
        Assert.assertEquals(e.elemSubBtnElementsXpath(), subBtnElements, "mismatch in Sub buttons Elements (using xpath)");
    }

    @Test(enabled = false,
            description = "Sub buttons Forms",
            groups = {"All", "Selenium", "Forms"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0)
    public void testSubBtnForms() throws InterruptedException {
        List<String> subBtnForms = Arrays.asList("Practice Form");
        System.out.println("exp: " + Arrays.toString(subBtnForms.toArray()));
        e.navigateToDemoQaElementsPage();
        e.clickOnBtnFormsCss();
        Assert.assertEquals(e.elemSubBtnFormsCss(), subBtnForms, "mismatch in sub Forms btns (css)");
    }

    @Test(
            enabled = false,
            description = "Sub buttons Alerts",
            groups = {"All", "Selenium", "Alerts"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void testSubBtnAlerts() throws InterruptedException {
        List<String> subBtnAlerts = Arrays.asList("Browser Windows", "Alerts", "Frames", "Nested Frames", "Modal Dialogs");
        System.out.println("exp: " + Arrays.toString(subBtnAlerts.toArray()));
        e.navigateToDemoQaElementsPage();
        e.clickBtnAlertsCss();
        Assert.assertEquals(e.elemSubBtnAlertsCss(), subBtnAlerts,  "mismatch in sub Alerts btns (css)");
        Assert.assertEquals(e.elemSubBtnAlertsXpath(), subBtnAlerts,  "mismatch in sub Alerts btns (css)");
    }

    @Test(enabled = false)
    public void test01() throws InterruptedException {
        e.navigateToDemoQaElementsPage();
//        e.clickOnBtnElementsCss();
        Thread.sleep(2000);

        e.navigateToDemoQaElementsTextBoxPage();
                Thread.sleep(3000);
//        e.isElementBtnOpenElements();
    }







}
