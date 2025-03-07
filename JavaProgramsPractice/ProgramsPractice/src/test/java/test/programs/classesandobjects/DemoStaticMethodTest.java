package test.programs.classesandobjects;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.programs.classandobjects.DemoStaticMethod;


public class DemoStaticMethodTest {

    @Test
    public void verifyStaticMethod(){
        Assert.assertEquals(
                DemoStaticMethod.printInput("Hema"),"Hema");
    }
}
