package com.example.study_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ByPassController {
  @RequestMapping(value = { "/forms/forms_inputs" })
  public void forms() {
    int i = 0;
  }

  @RequestMapping(value = { "/**" })
  public void byPass() {
    int i = 0;
  }

}
