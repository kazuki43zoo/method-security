package com.example.domain.service;

import org.springframework.security.access.prepost.PreAuthorize;

public interface AccountService {

    String getAccount(String username);

}
