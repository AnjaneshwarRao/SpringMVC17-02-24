package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllerclass {
@RequestMapping(path = "/methodone", method = RequestMethod.GET)
@ResponseBody
	public String methodprinting() {
		return " Anjan printed method 1";
	}
	@RequestMapping(path ="/methodtwo", method = RequestMethod.GET)
	@ResponseBody
	public String method_two() {
		return "Method two is printing";
	}
	
	@RequestMapping(path = "/methodthree", method = RequestMethod.GET)
	@ResponseBody
	public String methodthree() {
		return "Anjan became a developer finally";
	}
}

