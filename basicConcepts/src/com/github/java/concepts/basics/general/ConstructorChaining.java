package com.github.java.concepts.basics.general;

/**
 * Source : https://www.geeksforgeeks.org/constructor-chaining-java-examples/
 *
 * Within same class: It can be done using this() keyword for constructors in same class
 * From base class: by using super() keyword to call constructor from the base class.
 */
public class ConstructorChaining {

    public static void main(String[] args) {

    }
    String firstName ;
    ConstructorChaining(String name ){
        this.firstName = name;
    }

    public class ConstructorChainingSubClass {

        ConstructorChainingSubClass(String firstName, String lastName){
//            super(firstName);

        }
    }
}
