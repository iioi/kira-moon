package com.tkira.moon.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/hi")
	public String hi() {
		return "hello world";
	}
	
}
