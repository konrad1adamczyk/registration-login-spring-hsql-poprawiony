package com.hellokoding.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.hellokoding.auth"})
@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class WebApplication
{
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class);
    }
}
