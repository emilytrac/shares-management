package com.ihe.customerservice.Service;

import java.util.List;

import com.ihe.customerservice.Entity.Customers;

public interface CustomersService {

    List<Customers> searchCustomersByCustomerId(int customerId);

}
