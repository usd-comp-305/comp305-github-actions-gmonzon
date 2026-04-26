package edu.sandiego.comp305;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testReverseNormalString(){
        assertEquals("olleh",
                StringUtils.reverseString("hello"),
                "'hello' reversed is 'olleh'.");
    }

    @Test
    public void testReverseSingleChar(){
        assertEquals("a",
                StringUtils.reverseString("a"),
                "Single characters return themselves.");
    }

    @Test
    public void testReverseEmptyString(){
        assertEquals("",
                StringUtils.reverseString(""),
                "Empty strings return themselves.");
    }

    @Test
    public void testReverseWithSpaces(){
        assertEquals("siht esrever",
                StringUtils.reverseString("reverse this"),
                "Reverse strings with spaces");
    }

    @Test
    public void testReversePalindrome(){
        assertEquals("racecar",
                StringUtils.reverseString("racecar"),
                "Palindromes return themselves.");
    }
}
