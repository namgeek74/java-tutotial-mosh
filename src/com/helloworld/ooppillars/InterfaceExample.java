package com.helloworld.ooppillars;

// Interface
interface AnimalInterface {
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

public class InterfaceExample implements AnimalInterface, SecondInterface {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    public void myOtherMethod() {
        System.out.println("this is my other method from second interface");
    }

}
