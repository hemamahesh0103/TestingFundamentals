package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNumbersTest {

    AddNumbers addNumbers = new AddNumbers();

    @Test
    void testSmallPositiveNumbers(){
        Assert.assertEquals(addNumbers.add(5, 10),15 );
    }

    @Test
    void testSmallNegativeNumbers(){
        Assert.assertEquals(addNumbers.add(-8, -2), -10);
    }

}
