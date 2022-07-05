package com.jinli.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//程序的主入口
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication
        SpringApplication.run(Application.class, args);
    }

}
