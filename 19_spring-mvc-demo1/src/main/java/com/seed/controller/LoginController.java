package com.seed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(path = "/login")
	public String login() {
		System.out.println("Loginservlet login method called!!!!!!!");
		
		
		return "login";
	}

}
