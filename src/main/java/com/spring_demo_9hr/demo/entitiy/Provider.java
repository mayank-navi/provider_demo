package com.spring_demo_9hr.demo.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "provider_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Provider {
    @Id
    private String providerName;
    private String flowName;
    private String downTimeStart;
    private String downTimeEnd;
}
