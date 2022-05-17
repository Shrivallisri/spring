package com.jobiak.imd.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jobiak.imd.model.Customer;

@SpringBootApplication
public interface CustomerRepo extends JpaRepository<Customer,Long> {


    
    
    
	}

