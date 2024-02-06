package org.mutation;

import org.junit.jupiter.api.Test;
import org.mutation.Palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    public void whenPalindrom_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }

// if (inputString.length() == 0) {
    @Test
    public void whenNotPalindrom_thanReject() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("box"));
    }

    //  return (firstChar == lastChar) && isPalindrome(mid);
    @Test
    public void whenNearPalindrom_thanReject() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("neon"));
    }

}
