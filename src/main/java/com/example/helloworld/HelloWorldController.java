package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/")
  public String get() {
    return "Hello World";
  }

  @RequestMapping("/health")
  public String health() {
    return "ok";
  }

}
