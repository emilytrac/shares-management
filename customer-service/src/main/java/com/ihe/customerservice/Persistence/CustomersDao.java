package com.ihe.customerservice.Persistence;

import com.ihe.customerservice.Entity.Customers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersDao extends JpaRepository<Customers, Integer> {
	
	public List<Customers> searchCustomersByCustomerId(int customerId);

}
