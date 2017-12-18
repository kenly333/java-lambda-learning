package com.lambda.learning;

import com.lambda.classroom.student.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParallelReducePeekTests {

    @Test
    public void mapAndReduceTest() {
        int count = Employee.buildList().parallelStream()
                .mapToInt(e -> e.getAge())
                .peek(age -> System.out.println("age: " + age))
                .reduce(0, (acc, element) -> acc + element);

        assertEquals(69, count);
    }

}
