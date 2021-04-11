package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class DemoApplication {

  @Autowired
  private Environment env;


  @RequestMapping("/greeting")
  public String example() {
    String value = env.getProperty("sample.text");
    return value;

  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}
