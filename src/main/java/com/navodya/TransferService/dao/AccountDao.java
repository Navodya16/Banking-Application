package com.navodya.TransferService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.navodya.TransferService.model.AccountModel;

@Repository
public interface AccountDao extends JpaRepository<AccountModel, Integer>{
	
	
}
