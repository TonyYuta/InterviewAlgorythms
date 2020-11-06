package AlgorythmsHandsOnExperience;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class DemoQaElementsTextBoxTest extends DemoQaBaseTest {

    @Test(
            enabled = true,
            description = "Fill out valid data",
            groups = {"Selenium", "All", "Elements", "Text-Box"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 1
    )
    public void testFillOutValidData() throws InterruptedException {
        String fullName = "Yu Ka";
        String email = "yu.ka@gmail.com";
        String currentAddress = "my current address";
        String permanentAddress = "my permanent address";

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("outputNameLabel", "Name:" + fullName);
        expected.put("outputEmailLabel", "Email:" + email);
        expected.put("outputCurrentAddressLabel", "Current Address :" + currentAddress);
        expected.put("outputPermanentAddressLabel", "Permananet Address :" + permanentAddress);

        Thread.sleep(1000);

        e.navigateToDemoQaElementsTextBoxPage();
        Thread.sleep(1000);

        etb.fillOutFullNameId(fullName);
        etb.fillOutUserEmailId(email);
        etb.fillOutCurrentAddressTextBoxId(currentAddress);
        etb.fillOutPermanentAddressTextBoxId(permanentAddress);
        Thread.sleep(1000);

        Map<String, String> actual = new HashMap<String, String>();
        actual = etb.clickSubmitBtnId();
        Thread.sleep(1000);

        Assert.assertEquals(actual, expected);
    }

}
