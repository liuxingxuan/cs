package com.us.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.springframework.boot.SpringApplication.run;

@SuppressWarnings("SpringBootApplicationSetup")
@ComponentScan(basePackages ="com.us.example")
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(Application.class, args);
    }
}