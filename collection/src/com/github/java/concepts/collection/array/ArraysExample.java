package com.github.java.concepts.collection.array;

import java.util.Arrays;

/**
 * Utility class for Array.
 */
public class ArraysExample {

    public static void main(String[] args) {
        new ArraysExample().run();
    }

    public void run() {
        int[] arr = {4, 3, 2, 1};
        //Point : array sorting on same object
        Arrays.stream(arr);
        //Point : Array stream
        Arrays.stream(arr).forEach(System.out::println);
        User[] userArray = {
                new User(1),
                new User(2),
                new User(3)
        };
        //Point : copyOf and copyOfRange will do shallow clone
        User[] userArrayClone = Arrays.copyOf(userArray, userArray.length);
        System.out.println(userArrayClone[2].id);
        userArrayClone[2].id = 10;
        System.out.println(userArray[2].id);
        userArrayClone = Arrays.copyOfRange(userArray, 0, userArray.length);
        System.out.println(userArrayClone[2].id);
        userArrayClone[2].id = 15;
        System.out.println(userArray[2].id);
    }

    private boolean assertTrue(Integer i1, Integer i2) {
        return i1 == i2;
    }

    private boolean assertFalse(Integer i1, Integer i2) {
        return i1 == i2;
    }

    class User {
        int id;

        User(int id) {
            this.id = id;
        }
    }
}
