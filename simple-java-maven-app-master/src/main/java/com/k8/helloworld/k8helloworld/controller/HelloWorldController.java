package com.k8.helloworld.k8helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


	@RequestMapping("/hello-world")
	public String helloWorld() {
		return "hello-world";
	}
}
