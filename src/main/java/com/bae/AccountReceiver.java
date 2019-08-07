package com.bae;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AccountReceiver {

	@Autowired
	private MongoAccountRepo repo;

	@JmsListener(destination = "AccountQueue")
	public void receiveMessage(Customer account) {
//		repo.save((SentAccount) jsonMessage.getObjectProperty("account"));
//		System.out.println(jsonMessage);
		repo.insert(account);
	}

	@JmsListener(destination = "AccountQueue")
	public void receiveMessage(String account) {
//		repo.save((SentAccount) jsonMessage.getObjectProperty("account"));
//		System.out.println(jsonMessage);
		System.out.println("Wrong hit");
		System.out.println(account);
		// repo.insert(account);
	}
}
