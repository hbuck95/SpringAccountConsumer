package com.bae;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AccountReceiver {

	@Autowired
	private MongoAccountRepo repo;

	@JmsListener(destination = "AccountQueue")
	public void receiveMessage(Account account) {
//		repo.save((SentAccount) jsonMessage.getObjectProperty("account"));
//		System.out.println(jsonMessage);
		repo.insert(account);
	}
}
