package com.ihe.customerservice.Service;

import com.ihe.customerservice.Entity.Customers;
import com.ihe.customerservice.Persistence.CustomersDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersServiceImpl implements CustomersService {
	
    @Autowired
    private CustomersDao customerDao;

	@Override
	public List<Customers> searchCustomersByCustomerId(int customerId) {
		return customerDao.searchCustomersByCustomerId(customerId);
	}

    

}
