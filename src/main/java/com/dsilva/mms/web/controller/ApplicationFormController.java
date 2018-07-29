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

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dsilva.mms.web.model.ApplicationForm;
import com.dsilva.mms.web.service.ApplicationFormService;

@Controller
public class ApplicationFormController extends BaseController{
	
	
	//private static Log log = LogFactory.getLog(ApplicationFormController.class.getName()); 
	private static Logger log= LogManager.getLogger(ApplicationFormController.class.getName());
	@Autowired
	private ApplicationFormService appFormService;
	
	public ApplicationFormController() {
	
	log.debug("Entring getApplicationForm ");

	log.debug("leaving getApplicationForm ");

	}

	@GetMapping(value="/getApplicationForm")
	public ModelAndView getApplicationForm(ModelAndView model) {
	
		log.debug("inside getApplicationForm ");
		model.addObject("applicationForm",new ApplicationForm());
		model.setViewName("applicationForm");
		model.addObject("applicationFormList",appFormService.findAllOrderByName(new ApplicationForm()));
		log.debug("List of objects"+model.getModel().get("applicationFormList"));
		log.debug("leaving getApplicationForm ");
		
		// test
		List<String> list = getList();
		model.addObject("lists", list);
		
		return model;
	}
	
	@PostMapping(value="/addApplicationForm")
	public ModelAndView addApplicationForm(ModelAndView model,@ModelAttribute(value="addApplicationForm") ApplicationForm form,BindingResult result) {
		log.debug(" inside addApplicationForm");
		
		appFormService.save(form);
		model.addObject("applicationForm",form);
		model.setViewName("applicationForm");
		model.addObject("applicationFormList",getAppFormService().findAllOrderByName(new ApplicationForm()));
		log.debug(" leaving addApplicationForm");
		return model;
	}

	public ApplicationFormService getAppFormService() {
		return appFormService;
	}

	public void setAppFormService(ApplicationFormService appFormService) {
		this.appFormService = appFormService;
	}

	private List<String> getList() {

		List<String> list = new ArrayList<String>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		list.add("List D");
		list.add("List 1");
		list.add("List 2");
		list.add("List 3");

		return list;

	}



	

	
	

}
