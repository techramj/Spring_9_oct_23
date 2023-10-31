package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	
	//http://localhost:8080/test
	@ResponseBody
	@RequestMapping(value = "/test")
	public String test() {
		return "test"; //body
	}
	
	@RequestMapping(value = "/test1")
	public String test1() {
		return "test"; //view 
	}

}
