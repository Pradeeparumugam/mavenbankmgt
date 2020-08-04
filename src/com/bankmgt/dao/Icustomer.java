package com.bankmgt.dao;

import com.bankmgt.entities.Account;

public interface Icustomer {
	public Account findById(int id);
	public Account updatePan(int id,String newPan);
	void add(Account account);
	public Account update(Account account); 
	public void delete(int id);

}
