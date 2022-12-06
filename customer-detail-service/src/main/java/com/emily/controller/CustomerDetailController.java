package com.emily.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emily.entity.CustomerDetail;
import com.emily.service.CustomerDetailService;

@Controller
public class CustomerDetailController {

	@Autowired
	private CustomerDetailService customerDetailService;
	
	// navigating to page to allow the user to input customer id
	@RequestMapping("/")
	public ModelAndView getUserInputPage() {
		return new ModelAndView("InputCustomerId");
	}
	
	// navigating to page to show customer details after submission of customer id
	@RequestMapping("/checkDetails")
	public ModelAndView checkDetailsController(@RequestParam("customerId") int customerId) {
		ModelAndView modelAndView = new ModelAndView();
		
		List<CustomerDetail> customerDetails=customerDetailService.getCustomerDetailByCustomerId(customerId);
		
		modelAndView.addObject("customerDetails", customerDetails);
		modelAndView.addObject("customerId", customerId);
		modelAndView.setViewName("ShowDetails");
		return modelAndView;
	
	}
}
