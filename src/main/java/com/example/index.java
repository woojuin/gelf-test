package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class index {
  @RequestMapping("/")
  public String Index() {
    try {
    return "Hello NEO WWW";
    }
    catch (Exception ex)
    {
      return ex.getMessage();
    }
  }
}
