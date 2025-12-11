package com.java.streamandlambda;

import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Jane","Jack","jill","Jennie");
        List<String> nameEndsWithe = names.stream().filter(x->x.endsWith("e")).toList();
        System.out.println(nameEndsWithe);
    }

}
