package com.lambda.learning;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class CollectTests {

    @Test
    public void forAndCollectTest() {
        List<Employee> collected = new ArrayList<>();
        for (Employee e : Employee.buildList()) {
            if (e.getCountry() == "China") {
                collected.add(e);
            }
        }
        assertEquals(2, collected.size());

        collected.forEach(System.out::println);
    }

    @Test
    public void collectListTest() {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        assertEquals(Arrays.asList("a", "b", "c"), collected);
    }

    @Test
    public void filterAndCollectListTest() {
        List<Employee> collected = Employee.buildList().stream()
                .filter(e -> e.getCountry() == "China")
                .collect(Collectors.toList());
        assertEquals(2, collected.size());

        collected.forEach(System.out::println);
    }

    @Test
    public void collectMaxTest() {
        Function<Employee, Integer> func = e -> e.getAge();
        Optional<Employee> collected = Employee.buildList().stream()
                .collect(Collectors.maxBy(Comparator.comparing(func)));

        assertEquals((Integer) 24, collected.get().getAge());
    }

    @Test
    public void collectMinTest() {
        Function<Employee, Integer> func = e -> e.getAge();
        Optional<Employee> collected = Employee.buildList().stream()
                .collect(Collectors.minBy(Comparator.comparing(func)));

        assertEquals((Integer) 22, collected.get().getAge());
    }

    @Test
    public void collectAverageTest() {
        double average = Employee.buildList().stream()
                .collect(Collectors.averagingInt(e -> e.getAge()));

        assertEquals(23, (int) average);
    }
}
