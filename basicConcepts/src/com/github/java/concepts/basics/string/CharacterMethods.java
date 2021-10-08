package com.github.java.concepts.basics.string;

public class CharacterMethods {

    public static void main(String[] args) {
        Character c = new Character('A');
//        c.toString().toUpperCase();
        Character.toLowerCase(c);
        Character.toUpperCase(c);
        Character.isDigit(c);
        Character.isAlphabetic(c);
        Character.getNumericValue(c);
        Character.isLetterOrDigit(c);

    }
}
