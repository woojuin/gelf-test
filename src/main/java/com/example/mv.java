package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mv {
  @RequestMapping("openshift")
  public String home() {
    return ("hello OPENSHIFT LUCKY!!!");
  }
}
