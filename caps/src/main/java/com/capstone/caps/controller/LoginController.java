package com.capstone.caps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.capstone.caps.model.User;
import com.capstone.caps.repository.UserRepository;

@Controller
@SessionAttributes("loggedInUser")
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
		//model.addAttribute("action", "register");
	//	model.addAttribute("user", new User());
		return "register";
	}
	@PostMapping("search")
	public String search(@RequestParam String name,Model model) {
		model.addAttribute("msg",userRepository.findByName(name).size()+" users found");
		model.addAttribute("users",userRepository.findByName(name));
		
		
		return "index";
	}
	
	@PostMapping("register")
	public String register(@ModelAttribute User user,Model model) {
		if(userRepository.findByEmail(user.getEmail())!=null) {
			User user1 = userRepository.findByEmail(user.getEmail());
			user1.setFname(user.getFname());
			user1.setLname(user.getLname());
			user1.setPhone(user.getPhone());
			
			user1.setPassword(user.getPassword());
			userRepository.save(user1);
		}
		else {
		userRepository.save(user);
		}
		model.addAttribute("success", "User "+user.getFname()+" saved");
//		model.addAttribute("users", user);
		//model.addAttribute("user", new User());
	return "index";
}
	@GetMapping("delete")
	public String deleteUser(@RequestParam long id,RedirectAttributes redirect) {
		userRepository.deleteById(id);
		redirect.addFlashAttribute("petro","Delete Success");
		return "redirect:/index";
	}
	@GetMapping("update")
	public String updateUser(@RequestParam long id,Model model) {
		userRepository.findById(id);
		model.addAttribute("petro", "Update");
		model.addAttribute("user", userRepository.findById(id));
		//model.addAttribute("action", "updateUser");
		return "register";
	}
	@GetMapping("login")
	public String login(Model model) {
		model.addAttribute("msg","Login");
		return "login";
	}
	@GetMapping("users")
	public String users(Model model) {
		model.addAttribute("msg","Login");
		model.addAttribute("users",userRepository.findAll());
		return "users";
	}
	@PostMapping("login")
	public String signin(@RequestParam String email,
			@RequestParam String password,
			Model model) {
		User user = userRepository.findByEmail(email);
		if(user!=null && password.equals(user.getPassword())) {
			model.addAttribute("msg","Welcome"+email);
			model.addAttribute("loggedInUser", user);
		}
		else {
			model.addAttribute("error", "Invalid Credentials");
			return "login";
		}
		
		return "profile";
	}
	@PostMapping("updateUser")
	public String updateUser(@ModelAttribute User user,RedirectAttributes model) {
		User user1 = userRepository.findByEmail(user.getEmail());
		user1.setFname(user.getFname());
		user1.setLname(user.getLname());
		user1.setPhone(user.getPhone());
		
		user1.setPassword(user.getPassword());
		
		
		userRepository.save(user1);
	
		model.addFlashAttribute("success", "User "+user.getFname()+" updated");
//		model.addAttribute("users", user);
		//model.addAttribute("user", new User());
	return "redirect:/index";
	}
	@GetMapping("logout")
	public String logout(Model model, WebRequest request, 
	SessionStatus status, RedirectAttributes redirect) {	
	status.setComplete();
	request.removeAttribute("loggedInUser", WebRequest.SCOPE_SESSION);
	redirect.addFlashAttribute("msg", "You have been signed out");
	return "redirect:/login";
	}
	
	
}
