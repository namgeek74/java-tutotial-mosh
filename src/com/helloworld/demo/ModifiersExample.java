package com.helloworld.demo;

public class ModifiersExample {
    // Access Modifiers - controls the access level
    // Non-Access Modifiers - do not control access level, but provides other functionality

    // For class:
    // public: The class is accessible by any other class
    // default: The class is only accessible by classes in the same package. This is used when you don't specify a modifier

    // For attribute, method and constructor
    // public: The code is accessible for all classes
    // default: The code is only accessible in the same package. This is used when you don't specify a modifier
    // private: The code is only accessible within the declared class
    // protected: The code is accessible in the same package and subclasses

    // Non-Access Modifiers

    // For class:
    // final: The class cannot be inherited by other classes
    // abstract: The class cannot be used to create objects

    // For attribute, method
    // final: Attributes and methods cannot be overridden/modified
    final double PI = 3.14;

    // static: Attributes and methods belongs to the class, rather than an object
    static void myStaticMethod() {
        System.out.println("This is a static method, it's belongs to the class itself, not the object instance");
    }
    // abstract: Can only be used in an abstract class, and can only be used on methods
    // The method does not have a body, for example abstract void run();
    // The body is provided by the subclass (inherited from)
    // transient: Attributes and methods are skipped when serializing the object containing them
    // synchronized: Methods can only be accessed by one thread at a time
    // volatile: The value of an attribute is not cached thread-locally, and is always read from the "main memory"
}
