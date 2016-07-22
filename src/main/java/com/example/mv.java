package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mv {
  @RequestMapping("/openshift")
  @ResponseBody
  public String home() {
    return "hello OPENSHIFT";
  }
}