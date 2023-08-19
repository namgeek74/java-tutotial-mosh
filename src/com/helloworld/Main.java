package com.helloworld;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Your rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Your period: ");
        double period = scanner.nextDouble();

        double monthlyInterest = rate / (PERCENT * MONTHS_IN_YEAR);

        double result = principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), period))) / (Math.pow((1 + monthlyInterest), period) - 1));
        System.out.println("Your mortgage is: " + result);
    }
}
