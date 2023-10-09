package com.helloworld;

import com.helloworld.array.ArrayDemo;
import com.helloworld.exceptions.ExceptionDemo;
import com.helloworld.java8.DefaultMethodDemoImpl;
import com.helloworld.java8.FunctionalInterfacesDemo;
import com.helloworld.map.MapDemo;
import com.helloworld.ooppillars.*;
import com.helloworld.otherpackage.First;
import com.helloworld.stream.StreamDemo;
import com.helloworld.string.StringDemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        StreamDemo.show();
        DefaultMethodDemoImpl defaultMethodDemo = new DefaultMethodDemoImpl();
        defaultMethodDemo.start();
        defaultMethodDemo.stop();
        FunctionalInterfacesDemo functionalInterfacesDemo = (int a, int b) -> a + b;
        int result = functionalInterfacesDemo.calculate(1, 2);
        System.out.println("Calc:" + result);
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result;
    }

    public static int getElementSecond(int[] arr) {
        int max = 0;
        int secondMax = 0;
        int index = 0;
        int previousIndexMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                index = previousIndexMax;
                max = arr[i];
                previousIndexMax = i;
            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
                index = i;
            }
        }

        // ArrayList<Integer> arrayList = new ArrayList();
        // for (int i :
        //         arr) {
        //     arrayList.add(i);
        // }
        return index;
    }
}
