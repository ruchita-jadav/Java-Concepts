package com.github.java.concepts.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, Integer> map = getMap();
        // Point : key isn't present then putIfAbsent will add key,value
        map.putIfAbsent(6, 6);
        System.out.println(map.get(6));
        // Point : key is present then putIfAbsent won't update the value
        map.putIfAbsent(6, 7);
        System.out.println(map.get(6));
        // Point : key is present then put will update the value
        map.put(6, 7);
        System.out.println(map.get(6));
        //TODO computeIfAbsent
//        map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);

    }

    static HashMap<Integer, Integer> getMap() {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Point :  put method
        for (int i = 0; i < 5; i++) {
            map.put(i, i + 1);
        }
        return map;
    }
}
