package com.lambda.learning;

import org.junit.Test;

public class RunnableTests {

    @Test
    public void runnableTest() {
        Employee employee = new Employee().name("Hanmeimei");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(employee.toString());
            }
        }).start();
    }

    @Test
    public void runnableLambdaTest() {
        Employee employee = new Employee().name("Hanmeimei");
        new Thread(() -> System.out.println(employee.toString())).start();
    }
}
