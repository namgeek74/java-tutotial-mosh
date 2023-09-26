package com.helloworld.string;

public class StringDemo {
    private static String str = "This is a String";
    private static String strHeap = new String("String from Heap, not Strong Pool");

    public static void getLength() {
        System.out.println(str.length());
        System.out.println(strHeap.length());
    }

    public static void charAt(int i) {
        System.out.println(str.charAt(i));
    }

    public static void subString() {
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 11));
    }

    public static void concat() {
        System.out.println(str.concat(" a concat string"));
    }

    public static void indexOf() {
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("S"));
    }

    public static void lastIndexOf() {
        System.out.println(str.lastIndexOf("is"));
    }

    public static void equals() {
        System.out.println(str.equals("This is a String"));
        System.out.println(str.equals("This is a String 2"));
        System.out.println(str.equals("this is a string"));
        System.out.println(str.equalsIgnoreCase("this is a string"));
    }

    public static void withCase() {
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println("*" + str.concat("   ") + "*");
        System.out.println("*" + str.concat("   ").trim() + "*");
        System.out.println("feeksforfeeks".replace('f', 'g'));
        System.out.println("geeksforgeeks".contains("geeks"));
    }

    public static void printResult() {
        System.out.println(str);
        withCase();
    }

}
