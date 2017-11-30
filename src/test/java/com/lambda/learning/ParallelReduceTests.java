package com.lambda.learning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParallelReduceTests {

    @Test
    public void mapAndReduceTest() {
        int count = Employee.buildList().parallelStream()
                .mapToInt(e -> e.getAge())
                .reduce(0, (acc, element) -> acc + element);

        assertEquals(69, count);
    }

}
