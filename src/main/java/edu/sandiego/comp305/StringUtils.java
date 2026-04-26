package edu.sandiego.comp305;

public class StringUtils {
    private StringUtils(){
    }

    public static String reverseString(final String inputString){
        return new StringBuilder(inputString).reverse().toString();
    }
}
