package com.bae.entity;

public class SentCustomer {

	private String accountId;
	private String firstName;
	private String lastName;
	private String accountNumber;
	private int prize;

	public SentCustomer() {
	}

	public SentCustomer(String accountId, String firstName, String lastName, String accountNumber, int prize) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.accountId = accountId;
		this.prize = prize;
	}

	public String getId() {
		return accountId;
	}

	public void setId(String id) {
		this.accountId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}
}
