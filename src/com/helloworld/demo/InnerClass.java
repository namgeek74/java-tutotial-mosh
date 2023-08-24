package com.helloworld.demo;

public class InnerClass {
    int x = 10;

    class ChildClass {
        int y = 5;

        public int myInnerMethod() {
            return x;
        }
    }

    static class ChildStaticClass {
        int z = 15;
    }
}
