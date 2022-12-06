package com.ihe.customerservice.Resource;

import com.ihe.customerservice.Entity.CustomersList;
import com.ihe.customerservice.Service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomersResource {
	
    @Autowired
    private CustomersService customerService;

    @GetMapping(path="/customers/{cId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomersList searchCustomersByCustomerIdResource(@PathVariable("cId") int id){
        return new CustomersList(customerService.searchCustomersByCustomerId(id));
    }
}
