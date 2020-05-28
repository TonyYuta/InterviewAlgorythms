package AlgorythmsHandsOnExperience;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlgorythmsHandsOnExperienceTest {

    AlgorythmsHandsOnExperience ahe = new AlgorythmsHandsOnExperience();

    @Test(
            enabled = true,
            description = "fibonacci1",
            groups = {"fibonacci"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01fibonacci1() {
        int number01 = 1;
        long expected01 = 1;

        int number02 = 1;
        long expected02 = 1;

        int number03 = 2;
        long expected03 = 1;

        int number04 = 3;
        long expected04 = 2;

        int number05 = 10;
        long expected05 = 55;

        int number06 = 46;
        long expected06 = 1836311903; // max possible int output

        int number07 = 47;
        long expected07 = 2971215073L; // should be at least long

        Assert.assertEquals(ahe.fibonacci1(number01), expected01, "mismatch in fibonacci1 result 01");
        Assert.assertEquals(ahe.fibonacci1(number02), expected02, "mismatch in fibonacci1 result 02");
        Assert.assertEquals(ahe.fibonacci1(number03), expected03, "mismatch in fibonacci1 result 03");
        Assert.assertEquals(ahe.fibonacci1(number04), expected04, "mismatch in fibonacci1 result 04");
        Assert.assertEquals(ahe.fibonacci1(number05), expected05, "mismatch in fibonacci1 result 05");
        Assert.assertEquals(ahe.fibonacci1(number06), expected06, "mismatch in fibonacci1 result 06");
        Assert.assertEquals(ahe.fibonacci1(number07), expected07, "mismatch in fibonacci1 result 07");

    }

    @Test(
            enabled = true,
            description = "fibonacci2",
            groups = {"fibonacci"},
            dependsOnGroups = {},
            dependsOnMethods = {},
            priority = 0
    )
    public void test01fibonacci2() {
        int number01 = 1;
        long expected01 = 1;

        int number02 = 1;
        long expected02 = 1;

        int number03 = 2;
        long expected03 = 1;

        int number04 = 3;
        long expected04 = 2;

        int number05 = 10;
        long expected05 = 55;

        int number06 = 46;
        long expected06 = 1836311903; // max possible int output

        int number07 = 47;
        long expected07 = 2971215073L; // should be at least long

        Assert.assertEquals(ahe.fibonacci2(number01), expected01, "mismatch in fibonacci2 result 01");
        Assert.assertEquals(ahe.fibonacci2(number02), expected02, "mismatch in fibonacci2 result 02");
        Assert.assertEquals(ahe.fibonacci2(number03), expected03, "mismatch in fibonacci2 result 03");
        Assert.assertEquals(ahe.fibonacci2(number04), expected04, "mismatch in fibonacci2 result 04");
        Assert.assertEquals(ahe.fibonacci2(number05), expected05, "mismatch in fibonacci2 result 05");
        Assert.assertEquals(ahe.fibonacci2(number06), expected06, "mismatch in fibonacci2 result 06");
        Assert.assertEquals(ahe.fibonacci2(number07), expected07, "mismatch in fibonacci2 result 07");

    }

}
