package com.demo.demo_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@ComponentScan("com.demo.demo_project.*")
@EnableSwagger2
@EnableScheduling
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

    	SpringApplication.run(App.class, args);
    }
}
