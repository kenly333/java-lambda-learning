package com.lambda.learning;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private Integer age;
    private String country;

    public String getName() {
        return name;
    }

    public Employee name(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Employee age(Integer age) {
        this.age = age;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Employee country(String country) {
        this.country = country;
        return this;
    }


    public static List<Employee> buildList() {
        List<Employee> employees = Arrays.asList(new Employee(), new Employee(), new Employee());
        employees.get(0).name("Lilei").age(22).country("China");
        employees.get(1).name("Hanmeimei").age(23).country("China");
        employees.get(2).name("Tom").age(24).country("USA");
        return employees;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", age: " + this.getAge() + ", from: " + this.getCountry();
    }
}
