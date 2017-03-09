package SoftGroupTest;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    public PalindromeTest() {
    }

    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertTrue(Palindrome.isPalindrome("1221"));
    }

    @Test
    public void testIsNotPalindrome() throws Exception {
        Assert.assertFalse(Palindrome.isPalindrome("not palindrome"));
    }

    @Test
    public void testIsNotPalindromeNullValue() throws Exception {
        Assert.assertFalse(Palindrome.isPalindrome((String)null));
    }
}
