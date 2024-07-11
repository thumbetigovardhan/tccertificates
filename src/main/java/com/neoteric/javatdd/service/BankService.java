package com.neoteric.javatdd.service;

import com.neoteric.javatdd.modelBank.Account;
import com.neoteric.javatdd.modelBank.BankApplication;

import java.util.UUID;

public class BankService {

    public Account getaccount(BankApplication bankDetails) {
        Account account = null;

        if (bankDetails.depositAmount>=5000) {
            account = new Account();
            account.accountNo = account.accountNo;
            account.ifscCode = account.ifscCode+ UUID.randomUUID().toString();
            account.pin = 1443;
        }
        return account;
    }
}
