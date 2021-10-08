package com.github.java.concepts.questions.stringQuestions;

/**
 * Runtime exception
 */
public class Substring {

    public static void main (String[] args) {
        String message = "Hello world!";
        String newMessage = message.substring(6, 12)
                /**
                 * Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -6
                 */
                + message.substring(12, 6);
        System.out.println(newMessage);
    }
}
