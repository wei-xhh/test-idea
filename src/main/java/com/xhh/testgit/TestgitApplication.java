package com.xhh.testgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestgitApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestgitApplication.class, args);
        System.out.println("right...");
        System.out.println("left...");
        System.out.println("测试分支");
        System.out.println("hello world 标签");
    }

}
