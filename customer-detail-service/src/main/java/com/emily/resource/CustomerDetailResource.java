package com.emily.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emily.entity.CustomerDetailList;
import com.emily.service.CustomerDetailService;

@RestController
public class CustomerDetailResource {
	
	@Autowired
	private CustomerDetailService customerDetailService;
	
	// returning JSON type values for each share held by the specified customer
	@GetMapping(path="/customer/shares/{cId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerDetailList getCustomerDetailByCustomerIdResource(@PathVariable("cId") int customerId) {
		return new CustomerDetailList(customerDetailService.getCustomerDetailByCustomerId(customerId));
	}

}
