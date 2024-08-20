package com.navodya.TransferService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navodya.TransferService.model.AccountModel;
import com.navodya.TransferService.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {
	
	@Autowired
	AccountService accountService;
    
    @Autowired
    Environment environment;
	
    @GetMapping("allAccounts")
    public ResponseEntity<List<AccountModel>> getAllAccounts(){
        return accountService.getAllAccounts();
    }
    
    @PostMapping("add")
    public ResponseEntity<String> addAccount(@RequestBody AccountModel account){
        return  accountService.addAccount(account);
    }
    
    //get account by account id
    @GetMapping("getaccount/{accountId}")
    public AccountModel getAccountByAccountId(@PathVariable Integer accountId){
        return accountService.getAccountByAccountId(accountId);
    }
}
