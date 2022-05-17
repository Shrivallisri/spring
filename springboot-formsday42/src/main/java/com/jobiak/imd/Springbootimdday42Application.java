package com.jobiak.imd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;

@SpringBootApplication
public class Springbootimdday42Application{
	
	public static void main(String[] args) {
		SpringApplication.run(Springbootimdday42Application.class, args);
	
	}

}
