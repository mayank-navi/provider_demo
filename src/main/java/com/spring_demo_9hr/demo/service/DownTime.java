package com.spring_demo_9hr.demo.service;

public class DownTime {
    public String down_time_start;
    public String down_time_end;

    public DownTime(String down_time_start, String down_time_end) {
        this.down_time_start = down_time_start;
        this.down_time_end = down_time_end;
    }

    public String getDown_time_start() {
        return down_time_start;
    }

    public void setDown_time_start(String down_time_start) {
        this.down_time_start = down_time_start;
    }

    public String getDown_time_end() {
        return down_time_end;
    }

    public void setDown_time_end(String down_time_end) {
        this.down_time_end = down_time_end;
    }
}
