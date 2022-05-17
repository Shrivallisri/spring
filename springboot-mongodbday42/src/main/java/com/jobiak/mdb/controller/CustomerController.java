package com.jobiak.mdb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mdb.repository.CustomerRepository;
import com.jobik.mdb.model.Customer;
@Controller
public class CustomerController {
	@Autowired
	CustomerRepository custrepo;

	@RequestMapping(path="/test",method=RequestMethod.GET)
    public String redirect()
	{
		return "signup";
	}

	@RequestMapping(path="/signup",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("cust")Customer cust) {
		
		//System.out.println(user.getUserId()+user.getName());
		custrepo.save(cust);
		return "success";

}
}