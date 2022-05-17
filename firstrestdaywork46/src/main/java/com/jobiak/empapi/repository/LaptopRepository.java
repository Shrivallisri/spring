package com.jobiak.empapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.empapi.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long>{

	
}