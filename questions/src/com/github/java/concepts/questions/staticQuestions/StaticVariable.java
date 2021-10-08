package com.github.java.concepts.questions.staticQuestions;

/**
 *  Error at commented line variable name is case sensitive
 *  Also if variable name is correct then static method can access static variables only. so MESSAGE should be static.
 */
public class StaticVariable {

     String MESSAGE = "Hello!";

    static void print() {
//        System.out.println(message);
    }

    void print2() {
    }
}
