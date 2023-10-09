package com.helloworld.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show() {
        List<String> list = Arrays.asList("Nam", "Tien", "Son", "Hai");
        List<Integer> arrayNums = new ArrayList<>();
        arrayNums.add(1);
        arrayNums.add(2);
        arrayNums.add(3);
        Integer[] listOfNumbers = {1, 3, 2, 4, 6, 5};

        // 2 ways to init stream: from collection and from stream of method
        Stream<String> stream1 = list.stream();
        Stream<Integer> stream2 = arrayNums.stream();
        Stream<Integer> stream3 = Stream.of(4, 3, 2, 1);

        // stream1.forEach(item -> System.out.println(item));
        // stream2.filter(item -> item > 1).forEach(System.out::println);
        // stream3.map(item -> {
        //     System.out.println(item);
        //     return item;
        // }).toList();
        // Arrays.stream(listOfNumbers).sorted().forEach(System.out::println);

        // List<String> names = Arrays.asList("Charlie", "Alice", "Nam Nguyen", "Bob", "Alice", "David", "Eve");
        //
        // names.stream()
        //         .filter(name -> name.length() > 4)
        //         .distinct()
        //         .sorted()
        //         .map(String::toUpperCase)
        //         .limit(3)
        //         .skip(1)
        //         .forEach(System.out::println);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("C"));
        long count = names.stream().count();
        Optional<String> first = names.stream().findFirst();
        Optional<String> first2 = names.stream().findAny();

        System.out.println("Any match: " + anyMatch);
        System.out.println("Count: " + count);
        System.out.println("First element: " + first.orElse("None"));
        System.out.println("Any match: " + first2.orElse("None any"));

        Predicate<String> startWithCon = text -> text.startsWith("Con");
        Function<String, Boolean> startWithCon2 = text -> text.startsWith("Con");
        Consumer<Boolean> printLog = text -> System.out.println(text);
        names.stream().map(startWithCon2).peek(printLog).toList();
    }
}
