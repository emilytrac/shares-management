package com.ihe.customerservice.Persistence;

import com.ihe.customerservice.Entity.customerService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerServiceDao extends JpaRepository<customerService, Integer> {

}
