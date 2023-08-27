package com.helloworld.serialization;

import java.io.Serializable;

// to make one class become serializable, it needs to implement Serializable interface
// Static data members and transient data members are not saved via Serialization process
// if you don’t want to save value of a non-static data member then make it transient

public class SerializationDemo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public SerializationDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
