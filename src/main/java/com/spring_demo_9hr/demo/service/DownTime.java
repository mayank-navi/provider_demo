package com.spring_demo_9hr.demo.service;

public class DownTime {
    public String downTimeStart;
    public String downTimeEnd;

    public DownTime(String downTimeStart, String downTimeEnd) {
        this.downTimeStart = downTimeStart;
        this.downTimeEnd = downTimeEnd;
    }

    public String getDownTimeStart() {
        return downTimeStart;
    }

    public void setDownTimeStart(String downTimeStart) {
        this.downTimeStart = downTimeStart;
    }

    public String getDownTimeEnd() {
        return downTimeEnd;
    }

    public void setDownTimeEnd(String downTimeEnd) {
        this.downTimeEnd = downTimeEnd;
    }
}
