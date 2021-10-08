package com.github.java.concepts.collection.map;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class TreeMapValueIterator {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMapSortKey1 = new TreeMap<>(Comparator.reverseOrder());
        TreeMap<Integer, Integer> treeMapSortKey = new TreeMap<>(Comparator.comparingInt(x -> x));
        treeMapSortKey.put(1, 2);
        treeMapSortKey.put(1, 1);
//        treeMapSortKey.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        List<Integer> values = (List<Integer>) treeMapSortKey.values();
    }
}
