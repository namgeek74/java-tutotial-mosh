package com.helloworld;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte myAge = 27;
        int herAge =  myAge - 2;
        int viewsCount = 1_123_456_789;
        long viewsCount2 = 3_123_456_789L;
        float price = 10.99F;
        double extraPrice = 10.5203;
        char letter = 'n';
        boolean isSigned = true;
        System.out.println(herAge);
        System.out.println(viewsCount);
        System.out.println(viewsCount2);
        System.out.println(price);
        System.out.println(extraPrice);
        System.out.println(letter);
        System.out.println(isSigned);
        Date now = new Date();
        System.out.println(now);

        // primitive types is independent
        int x = 2;
        int y = x;
        x = 1;
        System.out.println(y);

        // reference types is store address of variable
        Point point = new Point(1, 1);
        Point point2 = point;
        point.x = 2;
        System.out.println(point2);
    }
}
