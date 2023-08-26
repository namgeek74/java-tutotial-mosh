package com.helloworld.string;

// StringBuilder was introduced in Java 1.5 as a replacement for StringBuffer.

public class BuilderAndBuffer {
    public static void show() {
        // String is immutable, it creates new object
        String immutable = "abc";
        immutable = immutable + "def";

        // StringBuffer and StringBuilder are mutable, we are using append method to modify them, no creating the new object
        StringBuffer sb = new StringBuffer("abc");
        sb.append("def");

        // Simply put, the StringBuffer is a thread-safe implementation and therefore slower than the StringBuilder.

        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
    }
}
