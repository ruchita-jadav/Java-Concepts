package com.github.java.concepts.basics.string;

public class StringBuilderExmaples {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.delete(0,3);
        stringBuilder.deleteCharAt(0);
        stringBuilder.reverse();
        stringBuilder.setCharAt(0,'c');
        stringBuilder.replace(0,3 ,"ruc");

    }
}
