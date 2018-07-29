package com.dsilva.mms.web.dao;

import java.util.List;

import com.dsilva.mms.web.model.ModelBean;


/*
 * Repository annotation defines to the Spring container that this is a resource.
 * Transaction anotation takes care to maintain transcations on the methods of this class.
 */



public interface BaseEntityDao{

	public void save(ModelBean obj); 

	public  void delete(ModelBean obj) ;

	public  void modify(ModelBean obj) ;

	public ModelBean getModel(int primaryid);
	
	public  List<ModelBean> findAllOrderByName(ModelBean obj);

}
