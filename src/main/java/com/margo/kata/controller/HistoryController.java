package com.margo.kata.controller;

import com.margo.kata.dao.AccountRepository;
import com.margo.kata.dto.TransactionDTO;
import com.margo.kata.model.Account;
import com.margo.kata.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {

    @Autowired
    private HistoryService historyService;
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/clients/{clientId}/accounts/{iban}/history")
    public ResponseEntity<List<TransactionDTO>> checkHistory(@PathVariable("iban") String iban) {
        return ResponseEntity.ok().body(historyService.getHistory());
    }
    @GetMapping("/clients/{clientId}")
    public ResponseEntity<Account> currentAccountStatus(@PathVariable("clientId") String clientId) {
        Account account =accountRepository.findByClientId(clientId);
        return ResponseEntity.ok().body(account);
    }
}
