package com.provider_info_demo_project.provider_info.provider;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.IdClass;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProviderPKid implements Serializable {
    private String provider;
    private String flowName;
}
