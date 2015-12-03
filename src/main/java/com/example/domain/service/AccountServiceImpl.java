package com.example.domain.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AccountServiceImpl implements AccountService {

    @PreAuthorize("#username == principal.username")
    public String getAccount(String username){
        return username;
    }

}
