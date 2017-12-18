package com.lambda.classroom.context;

import java.util.Objects;
import java.util.function.Predicate;

/**
 *
 */
public class Testcase {

    private Predicate predicate;
    private Integer score;
    private String description;
    private TestResult testResult = new TestResult();

    public Integer getScore() {
        return score;
    }

    public Testcase score(Integer score) {
        if (score < 0) {
            score = 0;
        }
        this.score = score;
        testResult.setScore(score);
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Testcase description(String description) {
        this.description = description;
        testResult.setDescription(description);
        return this;
    }

    /**
     * @param predicate
     * @return
     */
    public Testcase predicate(Predicate predicate) {
        Objects.requireNonNull(predicate);
        this.predicate = predicate;
        return this;
    }

    /**
     * @param inputData
     * @return
     */
    public Testcase test(Object inputData) {
        Boolean r = this.predicate.test(inputData);
        TestRecord record = new TestRecord();
        record.setInputData(inputData);
        record.setPassed(r);
        record.setActiveScore(r ? this.getScore() : 0);
        record.setEndTime(System.currentTimeMillis());

        this.testResult.getRecords().add(record);

        return this;
    }

    /**
     *
     */
    public void printResult() {
        System.out.println(this.testResult.toString());
    }
}
