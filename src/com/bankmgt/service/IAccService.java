package com.bankmgt.service;

import com.bankmgt.entities.Account;

public interface IAccService {
	public Account findById(int id);
	public Account updatePan(int id,String newPan);
	void add(Account account);
	public Account update(Account account); 
	public void delete(int id);

}
