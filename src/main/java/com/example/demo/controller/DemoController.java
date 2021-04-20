package com.example.demo.controller;

import com.example.demo.configuration.JsonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @Value("${sample.text}")
  private String value;

  @Autowired
  private JsonProperties jsonProperties;


  @GetMapping("/greeting")
  public String example() {
    String text = value +" "+jsonProperties.getFirstName()+" "+jsonProperties.getLastName();
    return  text;
  }
}
