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
import org.springframework.transaction.annotation.Transactional;


/*
 * Repository annotation defines to the Spring container that this is a resource.
 * Transaction anotation takes care to maintain transcations on the methods of this class.
 */
@Repository
@Transactional
public  class BaseEntityDao<T> {





	private static Logger logger = LogManager.getLogger(BaseEntityDao.class.getSimpleName());
	
	@PersistenceContext
	protected EntityManager entityManager;

	public BaseEntityDao() {


	}

	public void save(T obj) {
		
		try {
			logger.debug(" Entity Manager Persisting started ");
			getEntityManager().persist(obj);
			logger.debug(" Entity Manager Persisting ended ");
		
			
		} catch (Exception e) {
			logger.fatal("Exception occured in Save"+e);
			
			
		}
		}

	public  List<T> findAllOrderByName(T obj){

		logger.debug("findAllOrderByName started");
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery criteria = cb.createQuery(obj.getClass());
		Root root= criteria.from(obj.getClass());

		criteria.select(root);
		logger.debug("findAllOrderByName started");
		return getEntityManager().createQuery(criteria).getResultList();
	}


	public  void delete(T obj) {
		
		try {
			logger.debug(" Entity Manager Persisting started ");
			getEntityManager().remove(obj);
			logger.debug(" Entity Manager Persisting ended ");
		
			
		} catch (Exception e) {
			logger.fatal("Exception occured in Remove"+e);
			
			
		}
	
	}


	public  void modify(T obj) {

			
		try {
			logger.debug(" Entity Manager Persisting started ");
			getEntityManager().merge(obj);
			logger.debug(" Entity Manager Persisting ended ");
		
			
		} catch (Exception e) {
			logger.fatal("Exception occured in Save"+e);
			
			
		}
	

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}
