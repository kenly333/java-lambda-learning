package com.lambda.learning;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectTests {

    @Test
    public void collectTest() {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        assertEquals(Arrays.asList("a", "b", "c"), collected);
    }

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
    public void filterAndCollectTest() {
        List<Employee> collected = Employee.buildList().stream()
                .filter(e -> e.getCountry() == "China")
                .collect(Collectors.toList());
        assertEquals(2, collected.size());

        collected.forEach(System.out::println);
    }
}
