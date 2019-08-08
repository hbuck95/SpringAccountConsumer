package com.bae.receiver;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.entity.Customer;
import com.bae.repository.MongoAccountRepo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class AccountReceiver {

	private MongoAccountRepo repo;
	private ObjectMapper objectMapper;

	@Autowired
	public AccountReceiver(MongoAccountRepo repo, ObjectMapper objectMapper) {
		this.repo = repo;
		this.objectMapper = objectMapper;
	}

	@JmsListener(destination = "AccountQueue")
	public void receiveMessage(String account) throws JsonParseException, JsonMappingException, IOException {
		Customer c = objectMapper.readValue(account, Customer.class);
		repo.insert(c);
	}

}
