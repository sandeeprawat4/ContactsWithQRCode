package com.sr.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@RestController
public class SpringRestController {

    @GetMapping("/connect")
    public String connect(){
        return "Spring Boot Application Connected.";
    }

}