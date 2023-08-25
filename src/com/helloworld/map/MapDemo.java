package com.helloworld.map;

// Map is not a subtype of Collection
// Map interface -> HashMap class -> LinkedHashMap class (allow null key and null value)
// Map interface -> SortedMap interface -> TreeMap class (not allow null key and null value)

import java.util.*;

public class MapDemo {
    public static void show() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put(null, "value3");
        hashMap.put("key4", null);
        hashMap.put(null, null);
        hashMap.put("key4", "abc");

        System.out.println(hashMap);

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("key1", "value1");
        linkedHashMap.put("key2", "value2");
        linkedHashMap.put("key3", "value3");
        linkedHashMap.put(null, null);

        System.out.println(linkedHashMap);

        SortedMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("key3", "value3");
        treeMap.put("key2", "value2");
        treeMap.put("key1", "value1");
        treeMap.put("key0", null);

        System.out.println(treeMap);
    }
}
