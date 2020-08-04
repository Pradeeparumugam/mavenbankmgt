package com.bankmgt.entities;

public class Account {
	private int id;
	private String pan;
	private double balance;
	private int account;

	public Account(String pan, double balance) {
		this.pan = pan;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}


	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
