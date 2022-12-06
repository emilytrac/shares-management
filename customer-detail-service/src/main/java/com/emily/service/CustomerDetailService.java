package com.emily.service;

import java.util.List;

import com.emily.entity.CustomerDetail;

public interface CustomerDetailService {
	
	List<CustomerDetail> getCustomerDetailByCustomerId(int customerId);

}
