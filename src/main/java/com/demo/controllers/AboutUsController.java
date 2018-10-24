package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("aboutus")
public class AboutUsController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "aboutus.index";
	}

}