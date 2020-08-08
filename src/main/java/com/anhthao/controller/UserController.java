package com.anhthao.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anhthao.domain.User;

@Controller
@RequestMapping("/users")
public class UserController {
	@GetMapping("/new")
	public String showView() {
		return "users/addOrEdit";
	}
	

	
//	@PostMapping("/saveOrEdit")
//	public String saveOrUpdate(Model model, HttpServletRequest request) {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		
//		return "users/detail";
//	}
//	

//	@PostMapping("/saveOrEdit")
//	public String saveOrUpdate(Model model, 
//			@RequestParam("username") String username,
//			@RequestParam("password") String password) {
//		
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		
//		return "users/detail";
//	}
//	
	@GetMapping("/edit/{username}")
	public String showEdit(@PathVariable("username") String username) {
		
		System.out.println("username: " + username);
		
		return "users/addOrEdit";
	}
	
	@PostMapping("/saveOrEdit")
	public String saveOrUpdate(Model model,User user) {
		
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		
		return "users/detail";
	}
}
