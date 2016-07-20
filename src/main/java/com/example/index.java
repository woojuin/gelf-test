package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class index {
  @RequestMapping("/")
  public String Index() {
    try {
      Logger logger = LoggerFactory.getLogger(this.getClass());
      logger.info("this is info");
      logger.debug("this is debug");
      logger.warn("this is warning");
      logger.error("this is error");
    }
    catch (Exception ex)
    {
      return ex.getMessage();
    }
    return "Send Gelf";
  }
}
