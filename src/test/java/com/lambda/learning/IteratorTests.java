package com.lambda.learning;

import com.lambda.classroom.student.Employee;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IteratorTests {

    @Test
    public void forTest() {
        List<Employee> employees = Employee.buildList();
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void forEachTest() {
        List<Employee> employees = Employee.buildList();
        employees.forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void forCountTest() {
        List<Employee> employees = Employee.buildList();
        int count = 0;
        for (Employee e : employees) {
            if (e.getCountry() == "USA") {
                count = count + 1;
            }
        }

        assertEquals(1, count);
    }

    @Test
    public void whileCountTest() {
        int count = 0;
        Iterator<Employee> iterator = Employee.buildList().iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getCountry() == "USA") {
                count++;
            }
        }

        assertEquals(1, count);
    }

    @Test
    public void streamCountTest() {
        long count = Employee.buildList().stream()
                .filter(e -> e.getCountry() == "USA")
                .count();

        assertEquals(1, count);
    }
}
