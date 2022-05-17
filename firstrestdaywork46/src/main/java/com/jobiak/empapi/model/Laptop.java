package com.jobiak.empapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	private Long lid;
	private String brand;
	private String model;
	private double price;
	
	public Laptop() {
		
	}
	
	

	public Long getLid() {
		return lid;
	}



	public void setMid(Long lid) {
		this.lid = lid;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
}