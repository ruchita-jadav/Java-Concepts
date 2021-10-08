package com.github.java.concepts.basics.string;

import java.util.Arrays;

/**
 * System.out.println("********* aa *********");
 */
public class StringManipulationExamples {

    public static void main(String[] args) {
        getCharacters();
        searchIndex();
        subStringMethods();
        manipulateString();
        replaceMathods();
    }

    private static void replaceMathods() {
        System.out.println("********* manipulateString *********");
        String s = "This is chris";

        /*
         *
         * String replace(char oldChar, char newChar)
         * String replace(CharSequence target, CharSequence replacement)
         * String replaceAll(String regex, String replacement)
         * String replaceFirst(String regex, String replacement)
         */

        String s1 = s.replace('i','[');
        System.out.println(s);
        System.out.println(s1);


        s1= s.replace("is","are");
        System.out.println(s);
        System.out.println(s1);

        s1= s.replaceAll("(?)is","are");
        System.out.println(s);
        System.out.println(s1);

        s1= s.replaceFirst("is","are");
        System.out.println(s);
        System.out.println(s1);
    }

    private static void manipulateString() {
        System.out.println("********* manipulateString *********");
        String s = "This was String";
        /*
         * String[] split(String regex)
         * String[] split(String regex, int limit)
         */
        String[] arr = s.split("s"); // "s" won't be part of any string
        Arrays.stream(arr).forEach(System.out::println);
        arr = s.split(" ", 2); // split the string in 2 parts
        Arrays.stream(arr).forEach(System.out::println);
        arr = s.split(" ", 6); // split the string in 6 parts
        Arrays.stream(arr).forEach(System.out::println);
        /*
         * CharSequence subSequence(int beginIndex, int endIndex)
         */
        CharSequence charSequence = s.subSequence(0, 5);
        System.out.println("subSequence - charSequence : " + charSequence);
        System.out.println("subSequence - charSequence Instance of String : " + charSequence instanceof String);


        /*
         * String trim()
         * String toLowerCase()
         * String toUpperCase()
         */
        System.out.println(" String is   ".trim() + ".");
        String s1 = s.toLowerCase();
        System.out.println(s);
        System.out.println("lowercase : "+s1);
        s1 = s.toUpperCase();
        System.out.println(s);
        System.out.println("uppercase : "+s1);
    }

    private static void searchIndex() {
        System.out.println("********* searchIndex *********");
        String s = "This being String";
        /*
         * int indexOf(int ch)
         * int lastIndexOf(int ch)	\
         */
        System.out.println("indexOf first occurrence  of i : " + s.indexOf('i'));
        System.out.println("lastIndexOf last occurrence  of i : " + s.lastIndexOf('i'));
        /*
         * int indexOf(int ch, int fromIndex)   // From index included
         * int lastIndexOf(int ch, int fromIndex)  // From index included
         */
        System.out.println("indexOf first occurrence  of i from 5th index : " + s.indexOf('i', 5)); //"being String"
        System.out.println("lastIndexOf last occurrence  of i from 5th index : " + s.lastIndexOf('i', 5)); //"This b"

        /*
         * int indexOf(String str)
         * int lastIndexOf(String str)
         */
        System.out.println("indexOf first occurrence  of ing  : " + s.indexOf("ing"));
        System.out.println("lastIndexOf last occurrence  of ing : " + s.lastIndexOf("ing"));

        /*
         * int indexOf(String str, int fromIndex)
         * int lastIndexOf(String str, int fromIndex)
         */
        System.out.println("indexOf first occurrence  of ing from 5th index : " + s.indexOf("ing", 5));
        System.out.println("lastIndexOf last occurrence  of ing from 5th index : " + s.lastIndexOf("ing", 5));

        /*
         * boolean contains(CharSequence s)
         */
        System.out.println("contains String : "+s.contains("String"));
        System.out.println("contains String : "+s.contains("string")); // S is small. As 's' and 'S' have different ascii values.
    }

    private static void subStringMethods() {
        System.out.println("********* subStringMethods *********");
        String s = "This was String";
        // Needs to store the return value
        s.substring(2);         /* String substring(int beginIndex)	*/
        System.out.println("without storing result  : " + s);
        s = s.substring(3);
        System.out.println("storing result : " + s);
        s = s.substring(2, 7);       /* String substring(int beginIndex, int endIndex)	*/
        System.out.println("end index specified : " + s);
    }

    private static void getCharacters() {
        System.out.println("********* getCharacters *********");
        String s = "This is String";
        System.out.println(s.charAt(2));
    }
}
