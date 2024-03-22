package com.bvcott.spring.learnspringframework.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bvcott.spring.learnspringframework.business.BusinessService;

@Component
public class MyWebController {
	@Autowired private BusinessService businessServ; 
	
	public long returnValueFromBusinessService() {
		return businessServ.calculateSum();
	}
	
}




