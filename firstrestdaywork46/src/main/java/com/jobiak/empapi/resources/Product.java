package com.jobiak.empapi.resources;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.jobiak.empapi.model.Laptop;
import com.jobiak.empapi.service.LaptopService;
@RestController
@RequestMapping("/catalog")
public class Product {
	@Autowired
	LaptopService service;
	@GetMapping(value="/display",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Laptop> showAll() {
		return service.getAll();
	}
	@GetMapping(value="/laptop",produces = MediaType.APPLICATION_JSON_VALUE)
	public Laptop showCatalog() {
		Laptop laptop=new Laptop();
		laptop.setBrand("Samsung");
	    laptop.setModel("E2FH.Dual Camera,32GBMemory,I got you");
	    laptop.setPrice(49999);
		return laptop;
	}
	@GetMapping("/intro")
	public String introduction() {
		return new String("The #1 Manufacture of Digital Laptop in Asia");
	}
	@GetMapping("/search/{modelId}")
	public String searchModel(@PathVariable(value="modelId")String modelId) {
		return new String(modelId + "is available in Blue and black colors,can be delivered in 24 hours");
	}
	@GetMapping("/search/{modelId}/brand/[brand]")
	public String searchModel(@PathVariable(value="modelId")String modelId,@PathVariable(value="brand")String brand) {
		return new String(modelId + " is available only in Blue and black colors,can be delivered in 24 hours");
	}
	
		@PostMapping(value="/create",consumes= MediaType.APPLICATION_JSON_VALUE,
				produces=MediaType.APPLICATION_JSON_VALUE)
		public Laptop addProduct(@RequestBody Laptop laptop) {
			
			//System.out.println(mobile);
			//repo.save(mobile);
			Laptop ref=service.addLaptop(laptop);
			return ref;
		}
		@PutMapping(value="/modify",consumes= MediaType.APPLICATION_JSON_VALUE,
				produces=MediaType.APPLICATION_JSON_VALUE)
		public Laptop modifyProduct(@RequestBody Laptop laptop) {
			Laptop ref=service.modifyLaptop(laptop);
			return ref;
		}
		@DeleteMapping(value="/remove/{lid}")
		public void removeProduct(@PathVariable(value="lid")Long lid) {
			System.out.println(lid);
			service.removeProduct(lid);
			
		}
		}