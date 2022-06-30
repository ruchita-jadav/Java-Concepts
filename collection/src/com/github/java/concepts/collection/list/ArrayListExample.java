package com.github.java.concepts.collection.list;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        setElement();
        removeElement();
    }

    /**
     * Method to remove the elements.
     */
    static void removeElement() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(2);
        integerArrayList.remove((Integer) 2);
    }

    /**
     * Set or replace the element at given index.
     */
    static void setElement() {
        ArrayList<String> list = new ArrayList<>();
        list.add("String1");
        list.add("String2");
        list.set(1, "newString");
        System.out.println(list.size());
        System.out.println(list);
    }
}
