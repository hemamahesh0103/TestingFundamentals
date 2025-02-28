package test.programs.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyNumbersTest {

MultiplyNumbers Multi = new MultiplyNumbers();

   @Test

    void MultiplyTwoNumbers() {Assert.assertEquals(Multi.mul(10,20),200 );}
    @Test
    void MultiplyNagitiveNumbers() {Assert.assertEquals(Multi.mul(5,-4),-20);}
    @Test
    void MultiplyTwoNegativeNumbers() {Assert.assertEquals(Multi.mul(-4,-5),20);}
    @Test
    void MultiplayByZero() {Assert.assertEquals(Multi.mul(3,0),0);}
    @Test
    void MultiplayLargeNumber() {Assert.assertEquals(Multi.mul(1000,2000),2000000);}



}
