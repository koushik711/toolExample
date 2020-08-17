package com.qa.visa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.visa.model.OrderDetails;
import com.qa.visa.repository.SpringVisaToolDAO;

@RestController
public class SpringVisaToolRestController {
	
	@Autowired
	public SpringVisaToolDAO dao;
	
	@RequestMapping("/getdbInfo")
	public List<OrderDetails> orderInformation() {
		
		List<OrderDetails> orderDetails = dao.isData();		 
		
		return orderDetails;
	}
	
	@RequestMapping("/heart")
	public String heartbeat() {

		return "alive";
	}
	
	

}

