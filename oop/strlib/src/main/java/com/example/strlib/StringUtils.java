package com.example.strlib;

public class StringUtils {

    public static String[] split(String str, String delimiter) {
        return str.split(delimiter);
    }

    public static String join(String[] strings, String delimiter) {
        return String.join(delimiter, strings);
    }

    public static String replace(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public static int indexOf(String str, String searchStr) {
        return str.indexOf(searchStr);
    }

    public static String format(String format, Object... args) {
        return String.format(format, args);
    }
}