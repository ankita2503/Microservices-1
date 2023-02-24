package com.microservices.limitsmicroservice.Controller;


import com.microservices.limitsmicroservice.Model.Limits;
import com.microservices.limitsmicroservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Limits limits;

    @Autowired
    Configuration config;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        limits.setMaximum(config.getMaximum());
        limits.setMinimum(config.getMinimum());
        return limits;

    }
}
