package com.github.java.concepts.collection.array;

import java.util.Arrays;
import java.util.Comparator;

public class TwoDArrayExample {
    public static void main(String[] args) {
        /*
            2D Array initialization
            7 0
            4 4
            7 1
            5 0
            6 1
            5 2
         */
        int[][] arr = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};


        /*
            2D Array sorting using comparator.
            Sorts first col in decreasing and for the same elements second column in increasing order
         */
        Comparator<int[]> comparator = (int[] x, int[] y) -> {
            if (x[0] == y[0]) {
                return Integer.compare(x[1], y[1]);
            } else {
                return Integer.compare(y[0], x[0]);
            }
        };

        Arrays.sort(arr, comparator);
        Arrays.stream(arr).forEach(x -> System.out.println(x[0] + " " + x[1]));
    }
}
