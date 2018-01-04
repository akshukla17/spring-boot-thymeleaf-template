package com.spring.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/loginForm")
	public String loginForm() {
		return "common/loginForm";
	}
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public String hello(HttpServletRequest request,Model model) {
		String name=request.getParameter("userName");
		if(name==null) {
			name="World";
		}
		model.addAttribute("message", name);
		return "welcome";
	}
}
