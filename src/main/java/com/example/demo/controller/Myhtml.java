package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Myhtml {
	@GetMapping("/GoToIndex")
	public String greetingIndex() {

		return "index.html";
	}
	@GetMapping("/GoToHome")
	public String home() {

		return "home.html";
	} 

}
