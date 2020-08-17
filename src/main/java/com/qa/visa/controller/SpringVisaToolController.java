package com.qa.visa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.qa.visa.model.OrderDetails;
import com.qa.visa.repository.SpringVisaToolDAO;

@Controller
public class SpringVisaToolController {
	
	@Autowired
	public SpringVisaToolDAO dao;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/getDetails")
	public ModelAndView getAlien(@RequestParam int oid)
	{
		ModelAndView mv=new ModelAndView("showOrder.jsp");
		dao.isData(oid);
		
		
//		mv.addObject(alien);
		return mv;
	}
}

