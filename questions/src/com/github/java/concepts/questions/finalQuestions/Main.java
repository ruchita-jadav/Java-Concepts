package com.github.java.concepts.questions.finalQuestions;

class MainClass {
    final String message() {
        return "Hello!";
    }
}

class Main extends MainClass {
    public static void main(String[] args) {
        /**
         * Non static method can not be referenced from static context
         */
//        System.out.println(message());
    }

    /**
     * Overridden method is final so can not override it
     *
     */
    /*String message() {
        return "World!";
    }*/
}


