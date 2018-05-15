package com.bookonspring.demo.sse;

public class UserCount {

    private long time;

    private int count;


    public UserCount() {
        this.time = System.currentTimeMillis();
    }

    public long getTime() {
        return this.time;
    }

    public long getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}