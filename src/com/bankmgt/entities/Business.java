package com.bankmgt.entities;

public class Business extends Customer {

	private String address;

	public Business(String id, String name, String address, Account account) {
		super(id, name, account);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
