package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.Customer;

@Repository
public interface MongoAccountRepo extends MongoRepository<Customer, Long> {
}