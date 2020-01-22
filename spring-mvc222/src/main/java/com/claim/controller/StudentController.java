package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Address;
import com.claim.entity.Student;
import com.claim.service.StudentService;

@Controller
public class StudentController {
@Autowired
	private StudentService studentService;
	
@GetMapping("/")
public String welcome(Model model) {
return "index";
}
@GetMapping("/sign-up")
public ModelAndView signUp(){
//	Student student = new Student();
//	student.setAddress(new Address());
return new ModelAndView("sign-up", "student", new Student());
}

@PostMapping("/sign-up") 
public String signUpHandler(Model model, @ModelAttribute("student") Student student, HttpSession session) {
this.studentService.saveStudent(student);
return "thank-you";
}
}