package com.bae;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoAccountRepo extends MongoRepository<Customer, Long> {
}