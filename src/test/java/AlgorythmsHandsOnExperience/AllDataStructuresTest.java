package AlgorythmsHandsOnExperience;

import org.testng.annotations.Test;
import org.testng.Assert;


public class AllDataStructuresTest {

    // create an instance of AllDataStructures
    AllDataStructures allDataStructures = new AllDataStructures();

    // Helper to convert an array to string
    public String arrayToString(int[] arr) {
        String result;
        result = allDataStructures.array01Array().toString();
        return result;
    }

    @Test(enabled = true, groups = {"bat", "array"}, priority = 0)
    public void testArray01() {
        int[] expected = {11,13,14,16,15,18,19,20};
        Assert.assertEquals(allDataStructures.array01Array(), expected, "arr01 doesn't match to expected");
    }


}
