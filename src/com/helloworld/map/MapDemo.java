package com.helloworld.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// Map is not a subtype of Collection
// Map interface -> HashMap class -> LinkedHashMap class (allow null key and null value)
// Map interface -> SortedMap interface -> TreeMap class (not allow null key and null value)

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

        Hashtable<Word, String> hashtable = new Hashtable<>();
        Word key1 = new Word("key 1");
        hashtable.put(key1, "value 1");
        Word key0 = new Word("key 0");
        hashtable.put(key0, "value 0");
        Word key2 = new Word("key 2");
        // the following line led to NullPointerException
        //        hashtable.put(key2, null);
        System.out.println(hashtable);

        // Compare HashMap and Hashtable
        // Hashtable is thread-safe and can be shared between multiple threads in the application
        // HashMap is not synchronized, therefore it's faster and uses less memory than Hashtable
        // HashMap allows adding one Entry with null as key as well as many entries with null as value
        // In contrast, Hashtable doesn't allow null at all
        // It is worth mentioning that since JDK 1.8, Hashtable has been deprecated
        // However, ConcurrentHashMap is a great Hashtable replacement
    }
}
