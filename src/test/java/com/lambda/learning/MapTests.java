package com.lambda.learning;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTests {

    @Test
    public void transformTest() {
        List<String> collected = new ArrayList<>();
        for (Employee e : Employee.buildList()) {
            String uppercaseString = e.getCountry().toUpperCase();
            collected.add(uppercaseString);
        }

        assertEquals(Arrays.asList("CHINA", "CHINA", "USA"), collected);
    }

    @Test
    public void mapTest() {
        List<String> collected = Employee.buildList().stream()
                .map(e -> e.getCountry().toUpperCase())
                .collect(toList());

        assertEquals(Arrays.asList("CHINA", "CHINA", "USA"), collected);
    }
}
