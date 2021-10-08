package com.github.java.concepts.questions.Q1;

public class MainMethodExtends {

    Object message() {
        return "Hello!";
    }

    public static void main(String[] args) {
        System.out.print(new MainMethodExtends().message());
        System.out.print(new Main2().message());
    }
}

class Main2 extends MainMethodExtends {
    String message() {
        return "World!";
    }
}
