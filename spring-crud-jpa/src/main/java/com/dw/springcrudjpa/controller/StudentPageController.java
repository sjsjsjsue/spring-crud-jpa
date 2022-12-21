package com.dw.springcrudjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentPageController {
  
  @GetMapping("/index.html")
  public String loadIndexpage() {
    return "index";
  }
}
