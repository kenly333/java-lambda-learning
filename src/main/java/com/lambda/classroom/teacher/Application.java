package com.lambda.classroom.teacher;

import com.lambda.classroom.context.ClassContext;
import com.lambda.classroom.student.Employee;

public class Application {

    public static void main(String[] args) {
        ClassContext context = new ClassContext();
        context.testcase((Employee e) -> e.getName().endsWith("i")).score(20).description("").test(new Employee().name("lilei").age(18)).printResult();
        context.testcase((Employee e) -> e.getAge() > 18).score(10).description("").test(new Employee().age(19)).printResult();
        context.pushResult();
    }
}
