package com.example.demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
	@GetMapping("/hello")
private String Hello() {
	//return "<text colour = "blue", font-size=8>";
	return "Hello World";
	
}
}
