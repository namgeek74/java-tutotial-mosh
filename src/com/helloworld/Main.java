package com.helloworld;

import com.helloworld.ooppillars.*;
import com.helloworld.otherpackage.First;

public class Main {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        InnerClass.ChildClass childClass = innerClass.new ChildClass();
        System.out.println(innerClass.x);
        System.out.println(childClass.y);
        System.out.println(childClass.myInnerMethod());
        InnerClass.ChildStaticClass childStaticClass = new InnerClass.ChildStaticClass();
        System.out.println(childStaticClass.z);
    }

}
