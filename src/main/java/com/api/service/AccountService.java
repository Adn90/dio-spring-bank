package com.api.service;

import com.api.domain.model.Account;

import java.util.List;

public interface AccountService {
    Account findById(Long id);
    List<Account> findAll();
}
