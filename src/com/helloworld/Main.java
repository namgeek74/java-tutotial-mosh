package com.helloworld;

import com.helloworld.array.ArrayDemo;
import com.helloworld.datastructure.ListNode;
import com.helloworld.exceptions.ExceptionDemo;
import com.helloworld.java8.DefaultMethodDemoImpl;
import com.helloworld.java8.FunctionalInterfacesDemo;
import com.helloworld.map.MapDemo;
import com.helloworld.ooppillars.*;
import com.helloworld.otherpackage.First;
import com.helloworld.stream.StreamDemo;
import com.helloworld.string.StringDemo;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);

        ListNode node20 = new ListNode(9);
        ListNode node21 = new ListNode(9, node20);
        ListNode node22 = new ListNode(9, node21);
        ListNode node23 = new ListNode(9, node22);
        ListNode node24 = new ListNode(9, node23);
        ListNode node25 = new ListNode(9, node24);
        ListNode node26 = new ListNode(9, node25);
        ListNode node27 = new ListNode(9, node26);
        ListNode node28 = new ListNode(9, node27);
        ListNode node29 = new ListNode(9, node28);
        ListNode node210 = new ListNode(1, node29);

        ListNode sumListNode = addTwoNumbers(node1, node210);
        System.out.println("Returned value");
        while (sumListNode.next != null) {
            System.out.println(sumListNode.val);
            sumListNode = sumListNode.next;
        }
        System.out.println(sumListNode.val);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println("Integer max value");
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Integer min value");
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Long max value");
        System.out.println(Long.MAX_VALUE);
        System.out.println("Long min value");
        System.out.println(Long.MIN_VALUE);
        System.out.println("Compare: " + (Integer.MAX_VALUE == 2_147_483_647));
        System.out.println(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE - 2 == Long.MAX_VALUE  -1);

        // Convert between int and long
        // int 4 bytes AND long 8 bytes
        // => int and auto casting to long
        // long need to explicit casting to int (cannot lossy conversion)
        int a = 1;
        long b = a;
        System.out.println(a);
        System.out.println(b);
        long c = Long.MAX_VALUE;
        int d = (int) c;
        System.out.println(d);
        System.out.println(c);

        System.out.println("End testing section");
        String s1 = "";
        while (l1.next != null) {
            s1 = l1.val + s1;
            l1 = l1.next;
        }
        s1 = l1.val + s1;

        String s2 = "";
        while (l2.next != null) {
            s2 = l2.val + s2;
            l2 = l2.next;
        }
        s2 = l2.val + s2;

        // Q: best way to convert string to integer or long data type?
        // parseInt or parseLong
        // because it returns primitive value

        long sum2 = Long.parseLong(s1) + Long.parseLong(s2);
        int sum3 = Integer.parseInt(s1);
        int sum4 = Integer.valueOf(s2);
        BigInteger sum = new BigInteger(s1).add(new BigInteger(s2));
        // System.out.println(sum);

        String sumStr = sum.toString();
        String[] arr = sumStr.split("");

        ListNode result = new ListNode(Integer.parseInt(arr[0]));

        if (sumStr.length() == 1) {
            return result;
        }

        for (int i = 1; i < arr.length; i++) {
            result = new ListNode(Integer.parseInt(arr[i]), result);
        }

        return result;
    }

    public static boolean makeEqual(String[] words) {
        int totalCharacters = 0;
        for (String word :
                words) {
            totalCharacters = totalCharacters + word.length();
        }
        int theRemainderOfDivision = totalCharacters % words.length;

        if (theRemainderOfDivision != 0) return false;

        // handle sub-task: perform at lease 1 operation
        boolean isOperate = false;
        for (String word : words) {
            if (word.length() != words[0].length()) {
                isOperate = true;
            }
        }

        return isOperate;
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
