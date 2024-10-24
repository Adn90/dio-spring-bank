package com.api.service.impl;

import com.api.domain.model.Account;
import com.api.domain.repository.AccountRepository;
import com.api.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
