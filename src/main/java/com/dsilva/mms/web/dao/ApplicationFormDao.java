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
 *	ApplicationFormDao.java
 *	21-Jul-2018
 *	marsh
 *	2018
 *	
 * SRNo		Name					Date 		Tag					Comment			
 ******************************************************************************/
/**
 * 
 */
package com.dsilva.mms.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.dsilva.mms.web.model.ModelBean;

/**
 * @author marsh
 *
 * Db related methods to be added to this class for customisation
 */
@Repository
public class ApplicationFormDao implements BaseEntityDao {

	//private static Log log=LogFactory.getLog(ApplicationFormDao.class.getName());
	private static Logger log= LogManager.getLogger(ApplicationFormDao.class.getName());
	@PersistenceContext
	private EntityManager  entityManager;

	/**
	 * 
	 */
	public ApplicationFormDao() {
	
		log.debug("Entring ApplicationFormDao constructor");

		
		log.debug("Leaving ApplicationFormDao constructor");
	}


	public void save(ModelBean obj) {

		log.debug(" Entity Manager Persisting started ");
		entityManager.persist(obj);
		log.debug(" Entity Manager Persisting ended ");


	}

	public  List<ModelBean> findAllOrderByName(ModelBean obj){

		log.debug("findAllOrderByName started"+obj.getClass());
		CriteriaBuilder cb =  entityManager.getCriteriaBuilder();
		CriteriaQuery criteria = cb.createQuery(obj.getClass());
		Root root= criteria.from(obj.getClass());

		criteria.select(root);
		log.debug("findAllOrderByName started");
		return  entityManager.createQuery(criteria).getResultList();
	}


	public  void delete(ModelBean obj) {

		log.debug(" Entity Manager Persisting started ");
		entityManager.remove(obj);
		log.debug(" Entity Manager Persisting ended ");



	}


	public  void modify(ModelBean obj) {

		log.debug(" Entity Manager Persisting started ");
		entityManager.merge(obj);
		log.debug(" Entity Manager Persisting ended ");




	}


	/* (non-Javadoc)
	 * @see com.dsilva.mms.web.dao.BaseEntityDao#getModel(int)
	 */
	@Override
	public ModelBean getModel(int primaryid) {
		// TODO Auto-generated method stub
		return null;
	}


}
