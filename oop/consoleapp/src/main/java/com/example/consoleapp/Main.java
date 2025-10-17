package com.example.consoleapp;

import com.example.strlib.StringUtils;

public class Main {
    public static void main(String[] args) {
        String text = "hello,world";

        // Пример использования метода split
        String[] parts = StringUtils.split(text, ",");
        System.out.println("Split: " + String.join(" ", parts));

        // Пример использования метода join
        String joined = StringUtils.join(parts, " ");
        System.out.println("Joined: " + joined);

        // Пример использования метода replace
        String replaced = StringUtils.replace(text, "world", "Java");
        System.out.println("Replaced: " + replaced);

        // Пример использования метода equalsIgnoreCase
        boolean isEqual = StringUtils.equalsIgnoreCase("hello", "HELLO");
        System.out.println("Equals Ignore Case: " + isEqual);

        // Пример использования метода indexOf
        int index = StringUtils.indexOf(text, "world");
        System.out.println("Index of 'world': " + index);

        // Пример использования метода format
        String formatted = StringUtils.format("Welcome to %s!", "Java");
        System.out.println("Formatted: " + formatted);
    }
}