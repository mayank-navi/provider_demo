package com.provider_info_demo_project.provider_info.provider;

import java.util.Date;

public class DownTime {
    public Date downTimeStart;
    public Date downTimeEnd;

    public DownTime(Date downTimeStart, Date downTimeEnd){
        this.downTimeStart = downTimeStart;
        this.downTimeEnd = downTimeEnd;
    }
}
