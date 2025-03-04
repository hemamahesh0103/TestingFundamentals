package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ModularDivisionTest {

    ModularDivision mod = new ModularDivision();

    @Test

    void testTwoModuloDivNumbers() {
        Assert.assertEquals(mod.ModularDivi(20,10), 0);
    }

}
