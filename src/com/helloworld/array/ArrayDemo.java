package com.helloworld.array;

import java.util.Arrays;

public class ArrayDemo {

    private static int[] myNum = {10, 20, 30, 40};

    public static void printResult() {
        System.out.println("Length: " + myNum.length);
        int[] myLengthRef = myNum;
        int[] myNumCopy = myNum.clone();
        System.out.println(Arrays.toString(myNumCopy));

        System.out.println(myNum == myLengthRef);
        System.out.println(myNum == myNumCopy);
        System.out.println(myNum.equals(myLengthRef));
        System.out.println(myNum.equals(myNumCopy));
        System.out.println(Arrays.compare(myNum, myNumCopy));

    }
}
