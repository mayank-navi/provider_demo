package com.provider_info_demo_project.provider_info.provider;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "provider_demo")
@IdClass(ProviderPKid.class)
public class Provider {
    @Id
    private String provider;
    @Id
    private String flowName;
    private Date downTimeStart;
    private Date downTimeEnd;

    public Provider() {
    }

    public Provider(String provider, String flowName, Date downTimeStart, Date downTimeEnd) {
        this.provider = provider;
        this.flowName = flowName;
        this.downTimeStart = downTimeStart;
        this.downTimeEnd = downTimeEnd;
    }

}
