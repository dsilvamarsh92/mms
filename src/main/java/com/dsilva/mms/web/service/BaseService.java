package com.dsilva.mms.web.service;

import java.util.List;

import com.dsilva.mms.web.model.ModelBean;

public  interface BaseService {

	public void save(ModelBean obj); 

	public  void delete(ModelBean obj) ;

	public  void modify(ModelBean obj) ;

	public ModelBean getModel(int primaryid);

	public  List<ModelBean> findAllOrderByName(ModelBean obj);

}
