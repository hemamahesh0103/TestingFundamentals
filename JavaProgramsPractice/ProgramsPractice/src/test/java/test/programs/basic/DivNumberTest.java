package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivNumberTest {

    DivNumbers div = new DivNumbers();

    @Test

    void DividingTwoNumbers() {
        Assert.assertEquals(div.division(10,2), 5);
    }
}
