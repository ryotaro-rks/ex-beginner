package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {
	@RequestMapping("")
	public String index() {
		return "exam01/exam01";
	}

	@RequestMapping("show")
	public String show(String name, Model model) {
		model.addAttribute("name", name);
		return "exam01/exam01-result";
	}
}
