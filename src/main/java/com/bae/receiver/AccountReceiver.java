package com.bae.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.entity.Customer;
import com.bae.repository.MongoAccountRepo;

@Component
public class AccountReceiver {

	@Autowired
	private MongoAccountRepo repo;

	@JmsListener(destination = "AccountQueue")
	public void receiveMessage(Customer account) {
		repo.insert(account);
	}

}
