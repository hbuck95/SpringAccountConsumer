package com.bae;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Account {

	private Long accountId;

	private String firstName;

	private String lastName;

	private String accountNumber;

	private int prize;

	public Account() {
	}

	public Account(Long accountId, String firstName, String lastName, String accountNumber, int prize) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.accountId = accountId;
		this.prize = prize;
	}

	public Long getId() {
		return accountId;
	}

	public void setId(Long id) {
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
