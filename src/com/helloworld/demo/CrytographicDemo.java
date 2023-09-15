package com.helloworld.demo;

public class CrytographicDemo {

    public static void logHashValue() {
        String str = "String data before hasing";
        // hashCode() method from Object class
        int hashValue = str.hashCode();
        System.out.println("hashed value of '" + str + "' is: " + hashValue);
    }
}
