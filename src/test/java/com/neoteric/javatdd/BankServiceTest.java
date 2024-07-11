package com.neoteric.javatdd;

import com.neoteric.javatdd.modelBank.Account;
import com.neoteric.javatdd.modelBank.BankApplication;
import com.neoteric.javatdd.service.BankService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class BankServiceTest {
    @Test
    public  void amountGreaterThan5000() {
        BankApplication details = new BankApplication();
        details.name = "Govardhan";
        details.age = 23;
        details.address = "pattabhipuram";
        details.nameOfBank = "SBI";
        details.contactNo = 998973665;
        details.date=new Date();
        details.depositAmount = 6000;
        BankService bankService = new BankService();
       Account account=bankService.getaccount(details);
        Assertions.assertNotNull(account.accountNo);
        Assertions.assertNotNull(account.ifscCode);
       Assertions.assertNotNull(account.pin);



    }
    @Test
    public void amountLessThan5000(){
        BankApplication details = new BankApplication();
        details.name = "Govardhan";
        details.age = 23;
        details.address = "pattabhipuram";
        details.nameOfBank = "SBI";
        details.contactNo = 998973665;
        details.date=new Date();
        details.depositAmount = 6000;
        Account account = new Account();
        account.accountNo = 4090527;
        account.ifscCode = "sbi00489";
        account.pin = 1443;
        BankService bankService = new BankService();
        account  =bankService.getaccount(details);
        Assertions.assertNotNull(account.accountNo);
        Assertions.assertNotNull(account.ifscCode);
        Assertions.assertNotNull(account.pin);

    }
}
