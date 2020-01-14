package com.claim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
@GetMapping("/")
public String welcome(Model model) {
return "index";
}
@GetMapping("/sign-up")
public String signUp(){
return "sign-up";
}

}