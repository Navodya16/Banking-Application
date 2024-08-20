package com.navodya.TransferService.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.navodya.TransferService.model.AccountModel;
import com.navodya.TransferService.dao.AccountDao;

@Service
public class AccountService {
	
	@Autowired
	AccountDao accountDao;

	public ResponseEntity<List<AccountModel>> getAllAccounts() {
		try {
            return new ResponseEntity<>(accountDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> addAccount(AccountModel accountModel){
		accountDao.save(accountModel);
		return new ResponseEntity<>("success",HttpStatus.CREATED);
	}

	public AccountModel getAccountByAccountId(Integer accountId) {
		return accountDao.findById(accountId).orElse(null);
	}

}
