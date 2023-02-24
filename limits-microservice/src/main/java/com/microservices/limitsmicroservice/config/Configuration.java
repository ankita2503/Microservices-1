package com.microservices.limitsmicroservice.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Setter
@Getter
public class Configuration {

    private int minimum;
    private int maximum;
}
