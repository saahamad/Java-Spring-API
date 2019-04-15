package com.starter.business;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.starter.dao.EnqueryRepository;
import com.starter.service.Enquery;

@Component
public class EnqueryBusiness {
	
	@Autowired
	EnqueryRepository enqueryDao;
	
	public String testConnection(){
		try {
			if(!enqueryDao.testEnquery())
			return "DB connected to Application!!";
		}catch (SQLException sql) {
			sql.printStackTrace();
		}
		return "Sorry DB could not be connected to Application!!";
	}
	
	public List<Enquery> displayEnqueries(){
		try {
			return enqueryDao.getEnqueries();
		}catch (SQLException sql) {
			sql.printStackTrace();
		}
		return null;
	}
	
	public boolean postEnquery(Enquery enquery){
		return enqueryDao.postEnquery(enquery);
	}

}
