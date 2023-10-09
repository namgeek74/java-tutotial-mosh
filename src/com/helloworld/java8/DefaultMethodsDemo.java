package com.helloworld.java8;

public interface DefaultMethodsDemo {
    void start();

    default void stop() {
        System.out.println("Stopping the vehicle");
    }
}
