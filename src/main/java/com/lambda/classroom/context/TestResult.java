package com.lambda.classroom.context;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * kenly
 */
public class TestResult {

    private Integer score;
    private String description;
    private List<TestRecord> records = new ArrayList();

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TestRecord> getRecords() {
        return records;
    }

    /**
     * @return toJson
     */
    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }


}
