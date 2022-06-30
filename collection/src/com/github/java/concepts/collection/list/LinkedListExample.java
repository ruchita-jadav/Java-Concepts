package com.github.java.concepts.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    static LinkedList<Integer> linkedList;

    public static void main(String[] args) {
        linkedList = new LinkedList<>();
        init();
        insertElement(2, 9);
        print();
    }

    private static void print() {
        linkedList.forEach(System.out::println);
    }

    /**
     * Insert an element at given index. Index starts from 0.
     *
     * @param index index in the list
     * @param element new value to put
     */
    private static void insertElement(int index, int element) {
        linkedList.add(index, element);
    }

    /**
     * Insert data into Linked list
     */
    private static void init() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
    }
}
