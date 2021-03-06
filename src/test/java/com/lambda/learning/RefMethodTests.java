package com.lambda.learning;

import com.lambda.classroom.student.Employee;
import org.junit.Test;

import java.util.List;

public class RefMethodTests {

    @Test
    public void forEachTest() {
        List<Employee> employees = Employee.buildList();
        employees.forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void frefMethodTest() {
        List<Employee> employees = Employee.buildList();
        employees.forEach(System.out::println);
    }
}
