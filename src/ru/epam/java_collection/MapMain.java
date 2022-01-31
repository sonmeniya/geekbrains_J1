package ru.epam.java_collection;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {

    }

    private static void collectsAndWorkWith() {
        Map<String, Integer> map = new HashMap<>();
        map.put("T-Shirt", 5);
        map.put("Jeans", 5);
        map.put("Gloves", 5);
        map.put("Hat", 5);
        System.out.println(map);
        int value = map.put("T-Shirt", 4);
        System.out.println(value);
        System.out.println(map);
        Set<String> set = map.keySet();
        Collection<Integer> collection = map.values();
        System.out.println(collection);
        System.out.println(set);
        Set<Map.Entry<String, Integer>> values = map.entrySet();
        System.out.println(values);
        map.put("T-Shirt", 5);
        Set<Integer> sets = new HashSet<>(collection);//collection from one element
        System.out.println(sets);
    }
}
