package test.programs.basic.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {
    Palindrome p = new Palindrome();

    @Test
    public void testValidPalindrome(){
        Assert.assertTrue(p.isPalindrome("madam"));
    }

    @Test
    public void testInvalidPalindrome(){
        Assert.assertFalse(p.isPalindrome("aab"));
    }
}
