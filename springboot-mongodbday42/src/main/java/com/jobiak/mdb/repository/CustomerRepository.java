package com.jobiak.mdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobik.mdb.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Long> {

	
}
