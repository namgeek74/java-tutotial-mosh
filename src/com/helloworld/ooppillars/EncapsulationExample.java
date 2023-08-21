package com.helloworld.ooppillars;

// Encapsulation
//   The meaning of Encapsulation is to make sure that sensitive data is hidden from users. To achieve this, you must:
//      - declare class variables/attributes as private
//      - provide public get and set methods to access and update the value of a private variable
//   WHY?
//      - better control of class attributes and methods
//      - class attribute can be made read-only (if you only use the get method), or write-only (if toy only use the set method)
//      - flexible: the programmer can change one part of the code without affecting others parts
//      - increased security of data

public class EncapsulationExample {
    private String name = "Nam";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static String uniqueName = "something";

    public void updateUniqueName(String name) {
        uniqueName = name;
    }

    // when not specify, it's become a default attribute and can access only in their package
    String defaultAttributeName = "a default attribute name";
}
