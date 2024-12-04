package com.json.beki;

public class DataModel {
    private String key;
    private int value;
    private int firstResult;
    private int secondResult;
    private int thirdResult;

    public DataModel(String key, int value, int firstResult, int secondResult, int thirdResult) {
        this.key = key;
        this.value = value;
        this.firstResult = firstResult;
        this.secondResult = secondResult;
        this.thirdResult = thirdResult;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public int getSecondResult() {
        return secondResult;
    }

    public int getThirdResult() {
        return thirdResult;
    }
}
