package com.jobiak.empapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobiak.empapi.model.Laptop;
import com.jobiak.empapi.repository.LaptopRepository;

@Service
public class LaptopService {
	@Autowired
	LaptopRepository repo;
	public Laptop addLaptop(Laptop laptop) {
		Laptop ref=repo.save(laptop);
		return ref;
	}
	public Laptop modifyLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return repo.save(laptop);
	}
	public void removeProduct(Long mid) {
		// TODO Auto-generated method stub
		repo.deleteById(mid);
		
	}
	public List<Laptop> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

}