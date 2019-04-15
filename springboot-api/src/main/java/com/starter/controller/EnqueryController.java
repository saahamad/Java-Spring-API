package com.starter.controller;

import java.util.List;
import java.util.ListIterator;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.starter.business.EnqueryBusiness;
import com.starter.service.Enquery;

@RestController
@RequestMapping("/EnqueryController")
public class EnqueryController {

	@Autowired
	private EnqueryBusiness enqueryBusiness;
	
	@RequestMapping("/testenquery")
	public String testEnquery() {	
		 StringJoiner joinNames = new StringJoiner(""); 
	        joinNames.add("Name");  
	        joinNames.add("Email");  
	        joinNames.add("Course");  
	        joinNames.add("Qualification");  
	        joinNames.add("Contact Number"); 
	        
		return "Fill the all required (*) details for enquery!!<br>"+joinNames+"<br>"+enqueryBusiness.testConnection();	
	}
	
	
	@RequestMapping("/enqueries")
	public String displayEnqueries(){	
		StringJoiner joinList = new StringJoiner(","); 
		List<Enquery> enqueryList = enqueryBusiness.displayEnqueries();
		ListIterator<Enquery> iterator = enqueryList.listIterator();
		while(iterator.hasNext()) {			
			Enquery enquery = (Enquery) iterator.next();
			joinList.add("<br>-----------------------------------------------");
			joinList.add("<br>Name :"+enquery.getName());
			joinList.add("<br>Contact number:"+enquery.getContactNumber());
			joinList.add("<br>Email ID:"+enquery.getEmailId());			
			joinList.add("<br>Qualification :"+enquery.getQualification());					
		}
		
		return "<br><h1>Enqueries</h1>"+joinList;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/enquery")
	public boolean addEnquery(@RequestBody Enquery enquery) {	
		
		if(enqueryBusiness.postEnquery(enquery))
		return true;
		
		return false;	
	}
}
