package com.lambda.classroom.context;

import com.lambda.classroom.student.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassContextTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase() throws Exception {
        ClassContext context = new ClassContext();
        context.testcase((Employee e) -> e.getName().endsWith("i")).score(20).description("").test(new Employee().name("lilei").age(18)).printResult();
        context.testcase((Employee e) -> e.getAge() > 18).score(10).description("").test(new Employee().age(19)).printResult();
        context.pushResult();
    }

}