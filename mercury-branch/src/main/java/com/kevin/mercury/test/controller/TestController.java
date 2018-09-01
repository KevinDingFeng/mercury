package com.kevin.mercury.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String test() {
		
		System.out.println("master");
		return "ok";
	}
}
