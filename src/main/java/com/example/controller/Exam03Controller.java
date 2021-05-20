package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam03")
public class Exam03Controller {
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03/exam03";
	}

	@RequestMapping("calc")
	public String calc(String item1, String item2, String item3) {
		Integer notaxSum = Integer.parseInt(item1) + Integer.parseInt(item2) + Integer.parseInt(item3);
		Double taxSum = notaxSum * 1.1;
		application.setAttribute("notaxSum", notaxSum);
		application.setAttribute("taxSum", taxSum);
		return "exam03/exam03-result";
	}
}
