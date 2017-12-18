package com.lambda.classroom.context;

import java.util.function.Predicate;

public class ClassContext {

    public <T> Testcase testcase(Predicate<T> predicate) {
        return new Testcase().predicate(predicate);
    }

    public void pushResult() {

    }
}
