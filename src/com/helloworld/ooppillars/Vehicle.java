package com.helloworld.ooppillars;

// Inheritance
// In Java, it is possible to inherit attributes and methods from one class to another. We group the inheritance concept into 2 categories:
//    subclass (child) - the class that inherits from another class
//    supperclass (parent) - the class being inherited from
// WHY: It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class

public class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}
