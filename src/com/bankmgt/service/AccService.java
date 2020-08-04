package com.bankmgt.service;

//import java.util.HashMap;
//import java.util.Map;

//import com.bankmgt.entities.*;
import com.bankmgt.dao.*;
import com.bankmgt.entities.Account;
import com.bankmgt.exceptions.*;

public class AccService implements IAccService{
	private Icustomer dao=new Implcustomer();

	@Override
	public Account findById(int id) {
		if(id<1) {
			throw new AccountIdException("Id cannot be negative or zero");
		}
		Account account=findById(id);
		return account;
	}

	@Override
	public Account updatePan(int id, String newPan) {
		// TODO Auto-generated method stub
		if(newPan==null || newPan.isEmpty()) {
			throw new AccountIdException("pan cant be null");
			
		}
		return null;
	}

	@Override
	public void add(Account account) {
		// TODO Auto-generated method stub
		if(account==null) {
			throw new AccountIdException(" cant be null");
			
		}
	}

	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		account=dao.update(account);
		return account;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}
}
	
	