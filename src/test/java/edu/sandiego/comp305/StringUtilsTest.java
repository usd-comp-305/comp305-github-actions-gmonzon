package edu.sandiego.comp305;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testReverseNormalString(){
        StringUtils testStringUtils = new StringUtils();
        assertEquals("olleh", testStringUtils.reverseString("hello"), "'hello' reversed is 'olleh'.");
    }

    @Test
    public void testReverseSingleChar(){
        StringUtils testStringUtils = new StringUtils();
        assertEquals("a", testStringUtils.reverseString("a"), "Single characters return themselves.");
    }

    @Test
    public void testReverseEmptyString(){
        StringUtils testStringUtils = new StringUtils();
        assertEquals("", testStringUtils.reverseString(""), "Empty strings return themselves.");
    }

    @Test
    public void testReverseWithSpaces(){
        StringUtils testStringUtils = new StringUtils();
        assertEquals("siht esrever", testStringUtils.reverseString("reverse this"), "Reverse strings with spaces");
    }

    @Test
    public void testReversePalindrome(){
        StringUtils testStringUtils = new StringUtils();
        assertEquals("racecar", testStringUtils.reverseString("racecar"), "Palindromes return themselves.");
    }
}
