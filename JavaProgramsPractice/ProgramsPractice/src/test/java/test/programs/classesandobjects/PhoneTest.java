package test.programs.classesandobjects;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.programs.classandobjects.Phone;

public class PhoneTest {

    Phone p  = new Phone();


    @Test
    public void testPhone() {
        p.setPhoneno(8989.89);
        System.out.println(p.getPhoneno());
        Assert.assertEquals(p.getPhoneno(), 8989.89);
    }



}


