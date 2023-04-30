package com.ahmad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//To make this a spring boot application we add @Spring-boot-application annotation to this
@SpringBootApplication
@RestController
//@EnableSwagger2
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public  String greet(){
        return "Hello";
    }
}
