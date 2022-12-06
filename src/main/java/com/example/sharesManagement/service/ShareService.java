package com.example.sharesManagement.service;

import com.example.sharesManagement.entity.Shares;

import java.util.Collection;

public interface ShareService {
    Collection<Shares> getAllShares();
    Shares searchShareByShareId (int shareId);
}
