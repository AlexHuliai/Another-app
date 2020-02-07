package com.capstone.caps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.capstone.caps.model.User;
import com.capstone.caps.repository.UserRepository;

@Controller

public class LoginController {
	

	private UserRepository userRepository;
	
	
	@Autowired
	public LoginController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	@ModelAttribute("user")
	
	User user() {
		return new User();
	}
	@GetMapping("register")
	public String register(Model model) {
		model.addAttribute("msg", "Register");
	//	model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("register")
	public String register(@ModelAttribute User user,Model model) {
		userRepository.save(user);
	
		model.addAttribute("success", "User "+user.getFname()+" saved");
//		model.addAttribute("users", user);
		//model.addAttribute("user", new User());
	return "index";
}

}
