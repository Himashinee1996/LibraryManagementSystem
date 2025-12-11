package com.java.streamandlambda;

import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Jane","Jack","Jill","Jennie");
        names.forEach(System.out::println);
    }
}
