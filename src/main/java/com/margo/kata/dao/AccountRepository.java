package com.margo.kata.dao;

import com.margo.kata.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

    Account findByIban(String iban);
    Account findByClientId(String clientId);
}
