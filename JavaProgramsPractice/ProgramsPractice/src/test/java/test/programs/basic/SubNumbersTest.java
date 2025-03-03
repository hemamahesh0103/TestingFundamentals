package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubNumbersTest {

    SubtractNumbers subNumbers = new SubtractNumbers();

    @Test


    void SubractTwoPositiveNumbers() { Assert.assertEquals(subNumbers.sub(20,10), 10);}

    @Test

    void SubtractNegativeNumbers() { Assert.assertEquals(subNumbers.sub(-10,70), -80);}
    @Test
    void SubtractTwoNegativeNumbers() {Assert.assertEquals(subNumbers.sub(-20,-10),-10);}

    @Test
    void SubtractNumbersZero() {Assert.assertEquals(subNumbers.sub(0,8),-8);}


}
