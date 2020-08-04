package com.bankmgt.dao;


import com.bankmgt.entities.*;
import com.bankmgt.exceptions.*;
//import com.bankmgt.service.*;
import java.util.*;

public class Implcustomer implements Icustomer {
	private Map<Integer,Account>store=new HashMap<>();
	
	
	private int generatedid;
	private int generateId() {
		generatedid++;
		return generatedid;
	}
	
	@Override
	public Account findById(int id) {
		Account account=store.get(id);
		if(account==null) {
			throw new AccountIdException("Account null for id="+id);
		}
		return account;
	}
	@Override
	public void add(Account account) {
		int id=generateId();
		store.put(id,account);
		account.setId(id);
		
	}
	@Override
	public Account updatePan(int id,String newPan) {
		Account account=findById(id);
		account.setPan(newPan);
		return account;
		
	}
	public Account update(Account account) {
		int id=account.getId();
		store.put(id,account);
		return account;
	}
	public void delete(int id)
	{
		store.remove(id);
	}

}
