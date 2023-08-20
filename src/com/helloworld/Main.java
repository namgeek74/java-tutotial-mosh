package com.helloworld;

public class Main {
    int x = 5;

    public static void main(String[] args) {
        InheritAbstractExample myObj = new InheritAbstractExample();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }

}
