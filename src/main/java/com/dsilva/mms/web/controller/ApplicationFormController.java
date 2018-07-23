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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dsilva.mms.web.model.ApplicationForm;
import com.dsilva.mms.web.service.BaseService;

@Controller
public class ApplicationFormController extends BaseController{
	
	
	private static Logger log = LogManager.getLogger(ApplicationFormController.class.getName()); 
	
	@Autowired
	private BaseService<ApplicationForm> appFormService;
	
	public ApplicationFormController() {
	super();
	log.debug("lodaing getApplicationForm ");
	}

	@GetMapping(value="/getApplicationForm")
	public ModelAndView getApplicationForm(ModelAndView model) {
	
		log.debug("inside getApplicationForm ");
		model.addObject("applicationForm",new ApplicationForm());
		model.setViewName("applicationForm");
		log.debug("leaving getApplicationForm ");
		return model;
	}
	
	@PostMapping(value="/addApplicationForm")
	public ModelAndView addApplicationForm(ModelAndView model,@ModelAttribute(value="addApplicationForm") ApplicationForm form) {
		log.debug(" inside addApplicationForm");
		
		appFormService.save(form);
		model.addObject("applicationForm",form);
		model.setViewName("applicationForm");
		log.debug(" leaving addApplicationForm");
		return model;
	}

	public BaseService<ApplicationForm> getAppFormService() {
		return appFormService;
	}

	public void setAppFormService(BaseService<ApplicationForm> appFormService) {
		this.appFormService = appFormService;
	}

	

	
	

}
