package edu.sandiego.comp305;

public class StringUtils {
    public static String reverseString(String inputString){
        String reversed = new StringBuilder(inputString).reverse().toString();
        return reversed;
    }
}
