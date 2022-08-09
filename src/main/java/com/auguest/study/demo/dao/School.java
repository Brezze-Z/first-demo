package com.auguest.study.demo.dao;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "school")
@Component
@Data
public class School {

    // 说明: 通过一个实体类，来读取配置文件中的内容。
    // 使用的注解：ConfigurationProperties。
    private String name;
    private String location;
    private int age;


}
