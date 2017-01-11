package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWorld {
	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}
}
