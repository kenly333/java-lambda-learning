package com.lambda.classroom.context;

import com.google.gson.Gson;

/**
 * kenly
 */
public class TestRecord {

    private Object inputData;
    private Boolean passed;
    private Integer activeScore;
    private long endTime;


    public Integer getActiveScore() {
        return activeScore;
    }

    public void setActiveScore(Integer activeScore) {
        this.activeScore = activeScore;
    }

    public Boolean getPassed() {
        return passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Object getInputData() {
        return inputData;
    }

    public void setInputData(Object inputData) {
        this.inputData = inputData;
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
