package com.lambda.learning;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class PredicateTests {

    public static void filter(List<Employee> employees, Predicate<Employee> condition) {
        for (Employee employee : employees) {
            if (condition.test(employee)) {
                System.out.println(employee.getName() + " ");
            }
        }
    }

    @Test
    public void predicateTest() {
        Employee employee = new Employee().name("Hanmeimei");
        Predicate<Employee> condition = e -> e.getName().startsWith("H");
        Boolean r = condition.test(employee);

        assertEquals(true, r);
    }

    @Test
    public void predicateParameterTest() {

        List<Employee> employees = Employee.buildList();
        System.out.println("Employee which's name starts with H :");
        filter(employees, e -> e.getName().startsWith("H"));

        System.out.println("Employee which's name ends with m ");
        filter(employees, e -> e.getName().endsWith("m"));

        System.out.println("Print all employees :");
        filter(employees, e -> true);

        System.out.println("Print no employee : ");
        filter(employees, e -> false);

        System.out.println("Print employee whose age greater than 23:");
        filter(employees, e -> e.getAge() > 23);

    }
}
