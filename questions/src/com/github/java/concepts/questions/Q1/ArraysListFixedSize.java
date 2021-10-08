package com.github.java.concepts.questions.Q1;

import java.util.Arrays;
import java.util.List;

public class ArraysListFixedSize {
    /**
     * This blocks are anonymous classes
     */
    static {
        System.out.println("static hi");
    }
    {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        /**
         * To call non static blocks
         */
        new ArraysListFixedSize();
        List<Integer> list = Arrays.asList(1,2);
        /**
         * Exception in thread "main" java.lang.UnsupportedOperationException
         * Arrays.list returns fixed size arrayList which can't be increased.
         */
        list.add(3);
    }
    {
        System.out.println("bye");
    }
}
