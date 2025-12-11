package com.java.streamandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Q3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jennie");
        System.out.println(names);
        List<String> newNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(newNames);
    }
}
