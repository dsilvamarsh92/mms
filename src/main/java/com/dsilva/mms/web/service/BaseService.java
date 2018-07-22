package com.dsilva.mms.web.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dsilva.mms.web.dao.BaseEntityDao;

public  class BaseService<T> {

	
	private static Logger log = LogManager.getLogger(BaseService.class.getName());
	public BaseService() {
		// TODO Auto-generated constructor stub
	}
	
	private BaseEntityDao<T> dao;
	
	public void save(T obj){
		log.debug("Inside save for BaseService");
		dao.save(obj);
		log.debug("exiting save for BaseService");
	}

	public void remove(T obj) {
		log.debug("Inside delete for BaseService");
		dao.delete(obj);
		log.debug("exiting delete for BaseService");
		
		
	} 
	
	public void modify(T obj) {
		log.debug("Inside modify for BaseService");
		dao.modify(obj);
		log.debug("exiting modify for BaseService");
		
		
		
	}
	
	
	public BaseEntityDao<T> getDao() {
		return dao;
	}

	public void setDao(BaseEntityDao<T> dao) {
		this.dao = dao;
	}
	
	
	
}
