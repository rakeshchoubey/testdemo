package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>calling before>>>>>>>>>>>>>>>>>>>>>>>.");  
    SpringApplication.run(Application.class, args);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>calling after>>>>>>>>>>>>>>>>>>>>>>>."); 
  }

}