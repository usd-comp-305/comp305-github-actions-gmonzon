package edu.sandiego.comp305;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testReverseNormalString(){
        final String testStringUtils = StringUtils.reverseString("hello");
        assertEquals("olleh",
                StringUtils.reverseString("hello"), "'hello' reversed is 'olleh'.");
    }

    @Test
    public void testReverseSingleChar(){
        final String testStringUtils = StringUtils.reverseString("a");
        assertEquals("a",
                StringUtils.reverseString("a"), "Single characters return themselves.");
    }

    @Test
    public void testReverseEmptyString(){
        final String testStringUtils = StringUtils.reverseString("");
        assertEquals("",
                StringUtils.reverseString(""), "Empty strings return themselves.");
    }

    @Test
    public void testReverseWithSpaces(){
        final String testStringUtils = StringUtils.reverseString("reverse this");
        assertEquals("siht esrever",
                StringUtils.reverseString("reverse this"), "Reverse strings with spaces");
    }

    @Test
    public void testReversePalindrome(){
        final String testStringUtils = StringUtils.reverseString("racecar");
        assertEquals("racecar",
                StringUtils.reverseString("racecar"), "Palindromes return themselves.");
    }
}
