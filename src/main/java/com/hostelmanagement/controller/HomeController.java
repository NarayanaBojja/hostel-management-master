package com.hostelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Narayana Bojja This is the Home controller which renders starting
 *         pages of application
 *
 */

@Controller
public class HomeController {

	
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home");
		return view;

	}

}
