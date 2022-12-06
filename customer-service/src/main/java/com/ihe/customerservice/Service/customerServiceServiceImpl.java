package com.ihe.customerservice.Service;

import com.ihe.customerservice.Entity.customerService;
import com.ihe.customerservice.Persistence.customerServiceDao;
import org.springframework.beans.factory.annotation.Autowired;

public class customerServiceServiceImpl implements customerServiceService {
    @Autowired
    private customerServiceDao customerServiceDao;

    @Override
    public customerService searchByDetailId(int id) {
        return customerServiceDao.findById(id).orElse(null);
    }

}
