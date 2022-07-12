package com.spring_demo_9hr.demo.entitiy;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "provider_info")
public class Provider {
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String provider_name;
    private String flow_name;
    private String down_time_start;
    private String down_time_end;

    @Override
    public String toString() {
        return "Provider{" +
                "provider_name='" + provider_name + '\'' +
                ", flow_name='" + flow_name + '\'' +
                ", down_time_start='" + down_time_start + '\'' +
                ", down_time_end='" + down_time_end + '\'' +
                '}';
    }

    public Provider(String provider_name, String flow_name, String down_time_start, String down_time_end) {
        this.provider_name = provider_name;
        this.flow_name = flow_name;
        this.down_time_start = down_time_start;
        this.down_time_end = down_time_end;
    }

    public Provider() {
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public String getFlow_name() {
        return flow_name;
    }

    public void setFlow_name(String flow_name) {
        this.flow_name = flow_name;
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
