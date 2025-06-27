package com.java.streamandlambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Himashinee" ,"Dulsara" , "Prabhath","Thiwanka" , "Thareendra" ,"Hemantha");
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);
    }
}
