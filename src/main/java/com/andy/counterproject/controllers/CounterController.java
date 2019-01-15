package com.andy.counterproject.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			count = 0;
			count++;
			session.setAttribute("count",  count);
		} else {
			count++;
			session.setAttribute("count", count);
		}
		return "index";
	}
	@RequestMapping("/counter")
	public String increment(Model model, HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		model.addAttribute("count", count);
		return "counter";
	}
	@RequestMapping("/double")
	public String doubleCount(Model model, HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			count = 0;
			count = count + 2;
			session.setAttribute("count",  count);
		} else {
			count = count + 2;
			session.setAttribute("count", count);
		}
		return "double";
	}
	@RequestMapping("/reset")
	public String reset(Model model, HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		session.setAttribute("count",  0);
		model.addAttribute("count", count);
		return "reset";
	}
}
