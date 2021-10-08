package com.github.java.concepts.questions.Q1;

public class LoopIncrement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i = i++) {
            System.out.print(i+" ");
            i += 1;
            System.out.println( "Hello World!");
        }
    }
}

