package com.auguest.study.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        System.out.println("启动成功Success!!!!");

        System.out.println("启动当前的参数信息，进行调整。!");

    }

}
