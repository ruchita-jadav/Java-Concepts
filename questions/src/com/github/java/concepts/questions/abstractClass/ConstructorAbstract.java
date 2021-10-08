package com.github.java.concepts.questions.abstractClass;

public class ConstructorAbstract extends AbstractClass{
    ConstructorAbstract(){
        super();
    }
    public static void main(String[] args) {
        new ConstructorAbstract();
    }
}

abstract class AbstractClass {

    AbstractClass() {
        System.out.println("abstract class constructor");
    }
}
