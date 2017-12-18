package com.lambda.classroom.context;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class TestResultTest {

    @Test
    public void toStringTest() {
        TestRecord record = new TestRecord();
        record.setActiveScore(20);
        record.setPassed(true);
        String src = record.toString();
        System.out.println(src);

        Gson gson = new Gson();
        TestRecord target = gson.fromJson(src, TestRecord.class);
        Assert.assertEquals(target.getActiveScore(), record.getActiveScore());
        Assert.assertEquals(target.getPassed(), record.getPassed());
    }

}