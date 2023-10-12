package com.helloworld.java8;

import java.util.Arrays;

public class MethodReferencesDemo {
    public static void main() {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Reference to a static method
        Arrays.sort(names, MethodReferencesDemo::compareByLength);

        // Reference to an instance method
        MethodReferencesDemo main = new MethodReferencesDemo();
        Arrays.sort(names, main::compareIgnoreCase);

        // Reference to a constructor
        Arrays.stream(names)
                .map(String::new)
                .forEach(System.out::println);
    }

    public static int compareByLength(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }

    public int compareIgnoreCase(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}
