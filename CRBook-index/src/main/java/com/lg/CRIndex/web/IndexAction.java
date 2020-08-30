package com.lg.CRIndex.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexAction {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
