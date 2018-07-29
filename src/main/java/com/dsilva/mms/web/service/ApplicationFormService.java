/*******************************************************************************
 * Copyright 2018 Dsilva Software Solution
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
 *	ApplicationFormService.java
 *	21-Jul-2018
 *	marsh
 *	2018
 *	
 * SRNo		Name					Date 		Tag					Comment			
 ******************************************************************************/
/**
 * 
 */
package com.dsilva.mms.web.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsilva.mms.web.dao.ApplicationFormDao;
import com.dsilva.mms.web.model.ModelBean;

/**
 * @author marsh
 *
 */
@Service
public class ApplicationFormService implements BaseService {

	//public static Log log=LogFactory.getLog(ApplicationFormService.class.getName());
	private static Logger log= LogManager.getLogger(ApplicationFormService.class.getName());

	
	@Autowired
	private ApplicationFormDao appFormDao;
	
	public ApplicationFormService() {

		log.debug("ApplicationFormDao constructor entering");
		
		
		log.debug("ApplicationFormDao constructor leaving");

	}

	/* (non-Javadoc)
	 * @see com.dsilva.mms.web.service.BaseService#save(com.dsilva.mms.web.model.ModelBean)
	 */
	@Transactional
	@Override
	public void save(ModelBean obj) {

		log.debug("ApplicationFormDao save entering");
		appFormDao.save(obj);
		
		log.debug("ApplicationFormDao save leaving");
	}

	/* (non-Javadoc)
	 * @see com.dsilva.mms.web.service.BaseService#delete(com.dsilva.mms.web.model.ModelBean)
	 */
	@Transactional
	@Override
	public void delete(ModelBean obj) {
		log.debug("ApplicationFormDao delete entering");
		appFormDao.delete(obj);
		
		log.debug("ApplicationFormDao delete leaving");
		
	}

	/* (non-Javadoc)
	 * @see com.dsilva.mms.web.service.BaseService#modify(com.dsilva.mms.web.model.ModelBean)
	 */
	@Transactional
	@Override
	public void modify(ModelBean obj) {
		log.debug("ApplicationFormDao modify entering");
		appFormDao.modify(obj);
		
		log.debug("ApplicationFormDao modify leaving");
		
	}

	/* (non-Javadoc)
	 * @see com.dsilva.mms.web.service.BaseService#getModel(int)
	 */
	@Transactional
	@Override
	public ModelBean getModel(int primaryid) {
		log.debug("ApplicationFormDao getModel entering");
		
		
		log.debug("ApplicationFormDao getModel leaving");
		return appFormDao.getModel(primaryid);
	}

	/* (non-Javadoc)
	 * @see com.dsilva.mms.web.service.BaseService#findAllOrderByName(com.dsilva.mms.web.model.ModelBean)
	 */
	@Transactional
	@Override
	public List<ModelBean> findAllOrderByName(ModelBean obj) {
		log.debug("ApplicationFormDao findAllOrderByName entering");
		
		
		log.debug("ApplicationFormDao findAllOrderByName leaving");
		return appFormDao.findAllOrderByName(obj);
	}

	public ApplicationFormDao getAppFormDao() {
		return appFormDao;
	}

	public void setAppFormDao(ApplicationFormDao appFormDao) {
		this.appFormDao = appFormDao;
	}

		
}
