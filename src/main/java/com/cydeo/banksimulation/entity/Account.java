package com.cydeo.banksimulation.entity;

import com.cydeo.banksimulation.enums.AccountType;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
public class Account {

    private UUID id;
    private BigDecimal balance;
    private AccountType accountType;
    private Date createDate;
    private Long userId;


}
