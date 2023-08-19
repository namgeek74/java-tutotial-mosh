package com.helloworld;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 1;
        System.out.println(Arrays.toString(numbers));
        String[] strs = new String[2];
        boolean[] arrBoolean = new boolean[3];

        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(arrBoolean));
        int[] intArrNumber = {2, 3, 5, 7, 2};
        Arrays.sort(intArrNumber);
        System.out.println(intArrNumber.length);
        System.out.println(Arrays.toString(intArrNumber));

        // multi dimension array
        int[][] nums = {{1, 2, 3}, {4, 5}};
        // nums[1][3] = 7;
        System.out.println(nums.length);
        System.out.println(nums[0].length);
        System.out.println(nums[1].length);

        // constant
        final float PI = 3.14F;
        // PI = 1;  Cannot assign a value to final variable 'PI'
    }
}
