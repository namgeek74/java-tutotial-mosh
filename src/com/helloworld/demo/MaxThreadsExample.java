package com.helloworld.demo;

public class MaxThreadsExample {
    public static void main() {
        Runtime runtime = Runtime.getRuntime();
        int availableProcessors = runtime.availableProcessors();
        long maxThreads = runtime.maxMemory() / (1024 * 1024 * 64); // Adjust the calculation based on available memory

        System.out.println("Available Processors: " + availableProcessors);
        System.out.println("Max Threads: " + maxThreads);
    }
}
