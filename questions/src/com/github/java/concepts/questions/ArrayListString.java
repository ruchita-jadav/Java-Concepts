package com.github.java.concepts.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. equals vs ==
 * 2.
 */
public class ArrayListString {

    public static void main(String[] args) {
        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = Arrays.asList(array);
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
        List<String> list4 = new ArrayList<>(Arrays.asList("A", new String("B"), "C","D"));
        System.out.println(list1.equals(list2));
        System.out.println(list1 == list2);
        System.out.println(list1.equals(list3));
        System.out.println(list2.equals(list4));
        list2.add("D");
        System.out.println(list1.equals(list2));
        System.out.println(list2.equals(list4));


    }

}
