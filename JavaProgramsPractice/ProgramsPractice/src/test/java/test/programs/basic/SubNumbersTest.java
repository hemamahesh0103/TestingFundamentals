package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubNumbersTest {

    SubtractNumbers subNumbers = new SubtractNumbers();

    @Test


    void testSubractTwoPositiveNumbers() { Assert.assertEquals(subNumbers.sub(20,10), 10);}

    @Test

    void testSubtractNegativeNumbers() { Assert.assertEquals(subNumbers.sub(-10,70), -80);}
    @Test
    void testSubtractTwoNegativeNumbers() {Assert.assertEquals(subNumbers.sub(-20,-10),-10);}

    @Test
    void testSubtractNumbersZero() {Assert.assertEquals(subNumbers.sub(0,8),-8);}


}
