package com.helloworld;

public class Main {
    public int x = 5;

    public static void main(String[] args) {
        Second secondInstance = new Second();
        System.out.println(secondInstance.secondMessage);
        System.out.println(secondInstance.secondAttribute);
        System.out.println(Recursion.sum(5, 10));
    }

}
