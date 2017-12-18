package com.lambda.learning;

import com.lambda.classroom.student.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MinMaxTests {

    @Test
    public void minByForTest() {

        List<Employee> employees = Employee.buildList();

        Employee min = employees.get(0);
        for (Employee e : employees) {
            if (e.getAge() < min.getAge()) {
                min = e;
            }
        }

        assertEquals(employees.get(0), min);
    }

    @Test
    public void minTest() {

        List<Employee> employees = Employee.buildList();
        Employee min = employees.stream()
                .min(Comparator.comparing(e -> e.getAge()))
                .get();

        assertEquals(employees.get(0), min);
    }

    @Test
    public void maxByForTest() {

        List<Employee> employees = Employee.buildList();

        Employee max = employees.get(0);
        for (Employee e : employees) {
            if (e.getAge() > max.getAge()) {
                max = e;
            }
        }

        assertEquals(employees.get(2), max);
    }

    @Test
    public void maxTest() {

        List<Employee> employees = Employee.buildList();
        Employee max = employees.stream()
                .max(Comparator.comparing(e -> e.getAge()))
                .get();

        assertEquals(employees.get(2), max);
    }


}
