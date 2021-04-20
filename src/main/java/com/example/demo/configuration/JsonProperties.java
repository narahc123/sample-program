package com.example.demo.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@Configuration
@PropertySource(
  value = "classpath:config/configprops.json",
  factory = JsonPropertySourceFactory.class)
@ConfigurationProperties
public class JsonProperties {

  private String  firstName;

  private String lastName;

  private String fullName;

}
