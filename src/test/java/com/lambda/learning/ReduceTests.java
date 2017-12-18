package com.lambda.learning;

import com.lambda.classroom.student.Employee;
import org.junit.Test;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class ReduceTests {

    @Test
    public void reduceTest() {
        int count = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);

        assertEquals(6, count);
    }

    @Test
    public void mapAndReduceTest() {
        int count = Employee.buildList().stream()
                .mapToInt(e -> e.getAge())
                .reduce(0, (acc, element) -> acc + element);

        assertEquals(69, count);
    }

    @Test
    public void reduceWithBinaryOperatorTest() {
        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        int count = accumulator.apply(
                accumulator.apply(accumulator.apply(0, 1),
                        2),
                3);

        assertEquals(6, count);


    }

    @Test
    public void forAccumulatorTest() {
        int acc = 0;
        for (Integer element : asList(1, 2, 3)) {
            acc = acc + element;
        }

        assertEquals(6, acc);
    }
}
