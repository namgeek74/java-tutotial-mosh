package com.helloworld.stream;

import com.helloworld.ooppillars.InterfaceExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show() {
        List<String> list = Arrays.asList("Nam", "Tien", "Son", "Hai");
        ArrayList<Integer> arrayNums = new ArrayList<>();
        arrayNums.add(1);
        arrayNums.add(2);
        arrayNums.add(3);

        // 2 ways to init stream: from collection and fromm stream of method
        Stream<String> stream1 = list.stream();
        Stream<Integer> stream2 = arrayNums.stream();
        Stream<Integer> stream3 = Stream.of(4, 3, 2, 1);

        stream1.forEach(item -> System.out.println(item));
        stream2.filter(item -> item > 1).forEach(System.out::println);
    }
}
