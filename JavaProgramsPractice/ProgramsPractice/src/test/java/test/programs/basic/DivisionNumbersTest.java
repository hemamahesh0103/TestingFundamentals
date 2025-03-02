package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionNumbersTest {

    DivisionNumbers divi = new DivisionNumbers();

    @Test
     void testPositiveNumbers() {
        Assert.assertEquals(divi.div(10,2), 5.0);
    }


}
