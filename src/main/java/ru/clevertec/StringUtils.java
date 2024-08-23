package ru.clevertec;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            int number = Integer.parseInt(str);
            return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}