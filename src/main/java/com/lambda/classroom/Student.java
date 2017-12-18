package com.lambda.classroom;

import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private String country;

    public static List<Student> buildList() {
        List<Student> employees = Arrays.asList(new Student(), new Student(), new Student());
        employees.get(0).name("Lilei").age(22).country("China");
        employees.get(1).name("Hanmeimei").age(23).country("China");
        employees.get(2).name("Tom").age(24).country("USA");
        return employees;
    }

    public String getName() {
        return name;
    }

    public Student name(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Student age(Integer age) {
        this.age = age;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Student country(String country) {
        this.country = country;
        return this;
    }

}
