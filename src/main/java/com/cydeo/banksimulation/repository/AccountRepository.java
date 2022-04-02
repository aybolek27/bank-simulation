package com.cydeo.banksimulation.repository;

import com.cydeo.banksimulation.entity.Account;
import com.cydeo.banksimulation.exception.RecorNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class AccountRepository {


    public static List<Account> accountList=new ArrayList<>();

    public Account save(Account account){
        accountList.add(account);
        return account;
    }

    public List<Account> findAll() {
        return  accountList;
    }

    public Account findById(UUID accountId) {

        return accountList.stream().filter(account -> account.getId().equals(accountId)).findAny().orElseThrow(()->new RecorNotFoundException("This account is not in database"));

    }
}
