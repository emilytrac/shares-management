package com.example.sharesManagement.service;

import com.example.sharesManagement.entity.Shares;
import com.example.sharesManagement.persistence.ShareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ShareServiceImpl implements ShareService {

    @Autowired
    private ShareDao shareDao;

    @Override
    public Collection<Shares> getAllShares() {
        return shareDao.findAll();
    }

    @Override
    public Shares searchShareByShareId(int shareId) {
        return shareDao.findById(shareId).orElse(null);
    }
}
