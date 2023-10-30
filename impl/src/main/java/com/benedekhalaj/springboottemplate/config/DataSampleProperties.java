package com.benedekhalaj.springboottemplate.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "datasample")
@Getter
@Setter
public class DataSampleProperties {
    private int userCount;
}
