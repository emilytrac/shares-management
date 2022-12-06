package com.emily.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.emily.entity.Customers;
import com.emily.entity.CustomerDetail;
import com.emily.entity.CustomersList;
import com.emily.entity.Shares;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<CustomerDetail> getCustomerDetailByCustomerId(int customerId) {
		
		
		// creating new list to store the shares the customer holds
		List<CustomerDetail> customerDetailList = new ArrayList<CustomerDetail>();
		DecimalFormat df = new DecimalFormat("#.##");
		
		// connecting to the customer service to get a list of instances of the same customer
		CustomersList customerList = restTemplate.getForObject("http://localhost:8083/customers/"+customerId, CustomersList.class);
		System.out.println(customerList);
		
		// producing details of the share held for each share the customer holds
		for (Customers customerShare:customerList.getCustomers()) {
			
			
			// connecting to the share service to get further details on the share held
			Shares shares=restTemplate.getForObject("http://localhost:8082/shares/" + customerShare.getShareId(), Shares.class);
			
			// new customer detail object
			CustomerDetail customerDetail = new CustomerDetail(customerShare.getCustomerId(), shares.getShareName(),
					customerShare.getQuantity(), shares.getMarketPrice(), df.format(customerShare.getQuantity() * shares.getMarketPrice()), customerShare.getShareType());
			
			customerDetailList.add(customerDetail);
		}
		
		return customerDetailList;

	}
}
