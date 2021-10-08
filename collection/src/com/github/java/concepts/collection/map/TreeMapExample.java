package com.github.java.concepts.collection.map;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Generally tree map does not allow duplicates
 */
public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMapSortKey1 = new TreeMap<>(Comparator.reverseOrder());
        TreeMap<Integer, Integer> treeMapSortKey = new TreeMap<>(Comparator.comparingInt(x -> x));
        treeMapSortKey.put(1, 2);
        treeMapSortKey.put(1, 1);
        treeMapSortKey.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        List<Integer> values = (List<Integer>) treeMapSortKey.values();
        System.out.println("*****************************");
        //allows duplicate
        TreeMap<Integer, Integer> treeMap = new TreeMap<>((x, y) -> {
            if (x == y) {
                return 1;
            }
            return x - y;
        });
        treeMap.put(1, 2);
        treeMap.put(1, 1);
        treeMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        System.out.println("*****************************");
        TreeMap<Integer, String> treeMapSortValue = new TreeMap<>();
    }

    public <Integer, String extends Comparable<String>> Map<Integer, String> sortByValues(final Map<Integer, String> map) {
        Comparator<Integer> valueComparator =
                (k1, k2) -> {
                    int compare =
                            (map.get(k2)).compareTo(map.get(k1));
                    if (compare == 0)
                        return 1;
                    else
                        return compare;
                };
        Comparator.comparing(k -> map.get(k));
        Map<Integer, String> sortedByValues =
                new TreeMap<>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
}




