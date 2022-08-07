package com.auguest.study.demo.dao;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "school")
@Component
@Data
public class School {

    private String name;
    private String location;
    private int age;

}
