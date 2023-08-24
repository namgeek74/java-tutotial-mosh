package com.helloworld.demo;

import com.helloworld.demo.AbstractClassExample;

public class InheritAbstractExample extends AbstractClassExample {
    public int graduationYear = 2018;

    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
