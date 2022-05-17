package com.jobiak.mvcjsp.Controller;
 import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jobiak.mvcjsp.model.SignupBean;


@Controller
public class SignupController {
	
	@GetMapping("/signup")
	public String doSignup(Model model) {
		SignupBean signupBean= new SignupBean();
		model.addAttribute("signupBean",signupBean);
		return "signup";
		
	}
	@PostMapping("/signupform")
	public String doSignupForm(@Valid @ModelAttribute("signupBean")SignupBean signupBean,BindingResult errors,Model model) {
		System.out.println(signupBean);
		if(errors.hasErrors()) {
			return "signup";
		}
		model.addAttribute("signupBean",signupBean);
		return "success";
		
	}
}
	


