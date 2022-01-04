package com.example.formloginjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FormLoginJpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(FormLoginJpaApplication.class, args);
  }

}
