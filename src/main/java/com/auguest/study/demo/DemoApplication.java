package com.auguest.study.demo;

import com.auguest.study.demo.dao.School;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

        // 获取显示School实体类对象。
        School school = (School)run.getBean("school");
        System.out.println(school.toString());

        System.out.println("启动成功Success!!!!");





    }

}
