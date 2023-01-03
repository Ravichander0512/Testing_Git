package com.rcr.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/string")
	public String test() {
		return "this is testing";
	}
	
	@GetMapping("/int")
	public int testInteger() {
		return 1;
	}

}
