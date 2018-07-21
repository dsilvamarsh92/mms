package com.dsilva.mms.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class DisplayController {


	private static Logger logger = LogManager.getLogger(DisplayController.class.getSimpleName());
	public DisplayController() {
		// TODO Auto-generated constructor stub
	}
	
	
	// this method is the entry point
	@GetMapping
	public ModelAndView getWelcomePage(ModelAndView model) {
		logger.debug("Invoking Welcome Page");
		model.setViewName("index");
		logger.debug("Response set to"+model.getViewName());
		
		return model;
		
	}
	
	public ModelAndView getApplicationForm(ModelAndView model) {
		
		model.setViewName("ApplicationForm");
		
		return model;
	}
	
	
}
