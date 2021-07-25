package com.luv2code.springbootdemo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	
	@GetMapping("/")
	public String hello() {
		return "hello-world time on server is"+LocalDateTime.now();
	}
}
