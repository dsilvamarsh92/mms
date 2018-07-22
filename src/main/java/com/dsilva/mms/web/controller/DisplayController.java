/*******************************************************************************
 * Copyright 2018 Marsh Dsilva
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.dsilva.mms.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class DisplayController extends BaseController {


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
