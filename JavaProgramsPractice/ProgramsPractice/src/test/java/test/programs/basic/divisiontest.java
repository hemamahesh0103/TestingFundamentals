package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class divisiontest {

    DivisionTest divi = new DivisionTest();

    @Test
     void DivisionNumbers() {Assert.assertEquals(divi.div(10,2), 5.0);
    }


}
