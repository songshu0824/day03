package com.songshu.day03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day03Application {

    public static void main(String[] args) {
        System.out.println("hello git");
        System.out.println("蓝色的直接提交");
        System.out.println("hot-fix");
        SpringApplication.run(Day03Application.class, args);
        System.out.println("master");
        System.out.println("git-update");
    }

}
