package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam02")
public class Exam02Controller {
	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "exam02/exam02";
	}

	@RequestMapping("calc")
	public String calc(String num1, String num2, Model model) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("total", Integer.parseInt(num1) + Integer.parseInt(num2));
		return "exam02/exam02-result";
	}

	@RequestMapping("toresult2")
	public String toresult2() {
		return "exam02/exam02-result2";
	}
}
