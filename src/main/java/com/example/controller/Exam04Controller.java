package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}

	@RequestMapping("")
	public String index(Model model) {
		return "exam04/exam04";
	}

	@RequestMapping("register")
	public String register(@Validated UserForm form, BindingResult result, RedirectAttributes redirectAttributes,
			Model model) {
		if (result.hasErrors()) {
			return index(model);
		}

		redirectAttributes.addFlashAttribute("name", form.getName());
		redirectAttributes.addFlashAttribute("age", form.getAge());
		redirectAttributes.addFlashAttribute("comment", form.getComment());

		return "exam04/exam04-result";
	}
}
