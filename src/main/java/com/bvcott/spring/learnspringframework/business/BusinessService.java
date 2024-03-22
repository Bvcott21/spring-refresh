package com.bvcott.spring.learnspringframework.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bvcott.spring.learnspringframework.data.DataService;

@Component
public class BusinessService {
	@Autowired private DataService dataServ;
	
	public long calculateSum() {
		List<Integer> data = dataServ.getData();
		
		return data.stream().reduce(Integer::sum).get();
	}
	
}