package com.vs.jenkins.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/hello-world")
	public String helloWorld() {
		return "hello-world";
	}

	public String forJunitOnly() {
		return "hello-world";
	}
}
