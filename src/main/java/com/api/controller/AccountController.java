package com.api.controller;

import com.api.domain.model.Account;
import com.api.domain.repository.AccountRepository;
import com.api.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable Long id) {
        var acc = accountService.findById(id);
        return ResponseEntity.ok(acc);
    }

    @GetMapping()
    public ResponseEntity<List<Account>> findAll() {
        var acc = accountService.findAll();
        return ResponseEntity.ok(acc);
    }
}
