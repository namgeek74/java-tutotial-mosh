package com.helloworld;

import com.helloworld.exceptions.ExceptionDemo;
import com.helloworld.map.MapDemo;
import com.helloworld.ooppillars.*;
import com.helloworld.otherpackage.First;
import com.helloworld.stream.StreamDemo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        MapDemo.show();
//        String a = "aas";
//        String b = "bca";
//        System.out.println("test");
//        System.out.println(a = b);
//        Thread t1 = new Thread();
//        Thread t2 = new Thread();
//        Thread t3 = t1;
//
//        String s1 = new String("GEEKS");
//        String s2 = new String("GEEKS");
//
//        System.out.println(t1 == t3);
//        System.out.println(t1 == t2);
//        System.out.println(s1 == s2);
//
//        System.out.println(t1.equals(t2));
//        System.out.println(s1.equals(s2));

        Runtime runtime = Runtime.getRuntime();
        int availableProcessors = runtime.availableProcessors();
        long maxThreads = runtime.maxMemory() / (1024 * 1024 * 64); // Adjust the calculation based on available memory

        System.out.println("Available Processors: " + availableProcessors);
        System.out.println("Max Threads: " + maxThreads);
    }
}
