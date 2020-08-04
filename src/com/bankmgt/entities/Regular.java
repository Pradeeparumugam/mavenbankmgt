package com.bankmgt.entities;

public class Regular extends Customer {

	private String address;

	public Regular(String id, String name, String address, Account account) {
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
