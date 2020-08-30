package com.lg.CRUser.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAction {

	@GetMapping("user")
	public String test() {
		return "user";
	}
}
