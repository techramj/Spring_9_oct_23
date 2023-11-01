package com.seed.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(path = {"/", "/login"}, method = RequestMethod.GET)
	public String loginPage() {
		logger.info("login page called!!!!!!!!!!!!!");
		return "loginPage";
	}
	
	
	@RequestMapping(path = {"login"}, method = RequestMethod.POST)
	public String onLogin(@RequestParam("username") String username) {
		logger.info("username:  {}", username);
		return "success";
	}
	
}
