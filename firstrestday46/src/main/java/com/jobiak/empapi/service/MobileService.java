package com.jobiak.empapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobiak.empapi.model.Mobile;
import com.jobiak.empapi.repository.MobileRepository;

@Service
public class MobileService {
	@Autowired
	MobileRepository repo;
	public Mobile addMobile(Mobile mobile) {
		Mobile ref=repo.save(mobile);
		return ref;
	}
	public Mobile modifyMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return repo.save(mobile);
	}
	public void removeProduct(Long mid) {
		// TODO Auto-generated method stub
		repo.deleteById(mid);
		
	}
	public List<Mobile> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

}