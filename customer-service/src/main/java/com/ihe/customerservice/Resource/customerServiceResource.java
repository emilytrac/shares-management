package com.ihe.customerservice.Resource;

import com.ihe.customerservice.Entity.customerService;
import com.ihe.customerservice.Service.customerServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class customerServiceResource {
    @Autowired
    private customerServiceService customerService;

    @GetMapping(path="/customerService/{mid}",produces = MediaType.APPLICATION_JSON_VALUE)

    public customerService searchByCustomerId(@PathVariable("mid") int id){
        return customerService.searchByDetailId(id);
    }
}
