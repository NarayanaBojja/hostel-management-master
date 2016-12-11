package com.hostelmanagement.controller;

import org.apache.log4j.Logger;
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

	private static final Logger LOG = Logger
			.getLogger(HomeController.class);

	@GetMapping("/")
	public ModelAndView home() {
		LOG.debug("home Page started");
		ModelAndView view = new ModelAndView("home");
		LOG.debug("home Page ended");
		return view;

	}

}
