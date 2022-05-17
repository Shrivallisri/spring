package com.jobik.mdb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="mycustomer")
public class Customer {

	private long Id;
	private String name;
	private double balance;
	public Customer(long id, String name, double balance) {
		super();
		Id = id;
		this.name = name;
		this.balance = balance;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	 
	
}
