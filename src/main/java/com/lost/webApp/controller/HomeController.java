package com.lost.webApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "Welcome to the Lost`s Home Page!";
	}

	@RequestMapping("/about")
	public String about() {
		return "Something about my Project";
	}

}
