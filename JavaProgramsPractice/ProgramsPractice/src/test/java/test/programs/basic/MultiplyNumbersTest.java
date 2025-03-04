package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyNumbersTest {

MultiplyNumbers Multi = new MultiplyNumbers();

   @Test

    void testMultiplyTwoNumbers() {Assert.assertEquals(Multi.mul(10,20),200 );}
    @Test
    void testMultiplyNagitiveNumbers() {Assert.assertEquals(Multi.mul(5,-4),-20);}
    @Test
    void testMultiplyTwoNegativeNumbers() {Assert.assertEquals(Multi.mul(-4,-5),20);}
    @Test
    void testMultiplayByZero() {Assert.assertEquals(Multi.mul(3,0),0);}
    @Test
    void testMultiplayLargeNumber() {Assert.assertEquals(Multi.mul(1000,2000),2000000);}



}
