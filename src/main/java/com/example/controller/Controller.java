package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Controller {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
}
