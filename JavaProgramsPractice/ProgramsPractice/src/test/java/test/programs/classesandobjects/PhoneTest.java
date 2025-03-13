package test.programs.classesandobjects;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.programs.classandobjects.Phone;

public class PhoneTest {

    Phone p  = new Phone();


    @Test

    public double testPhone() { Assert.assertEquals(p.getPhoneno(898585));}



}


