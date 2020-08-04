package com.bankmgt.entities;

public class Customer {
	private String id;
	private String name;
	private Account account;

	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Customer(String id, String name, Account account) {
		this(id, name);
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
