package com.example.sharesManagement.persistence;

import com.example.sharesManagement.entity.Shares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShareDao extends JpaRepository <Shares, Integer>{

    List<Shares> findByShareId (int shareId);

    @Query("from Shares where shareId =:shareNum")
    List <Shares> searchShareByShareId (@Param("shareNum") int shareId);
}
