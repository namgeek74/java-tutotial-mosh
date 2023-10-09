package com.helloworld.java8;

public class DefaultMethodDemoImpl implements DefaultMethodsDemo {
    @Override
    public void start() {
        System.out.println("Starting the vehicle");
    }

    @Override
    public void stop() {
        System.out.println("Stop the vehicle in concrete class");
    }
}
