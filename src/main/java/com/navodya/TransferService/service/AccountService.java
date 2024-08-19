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

	public org.springframework.http.ResponseEntity<String> addAccount(
		try {
        	int maxAppointmentNumber = appointmentDao.findMaxAppointmentNumberByScheduleId(appointment.getScheduleId());
            appointment.setAppointmentNumber(maxAppointmentNumber + 1);
            appointmentDao.save(appointment);
            return new ResponseEntity<>("success", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}

	public org.springframework.http.ResponseEntity<java.util.List<com.navodya.TransferService.model.AccountModel>> getAccountByAccountId(
			Integer accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
