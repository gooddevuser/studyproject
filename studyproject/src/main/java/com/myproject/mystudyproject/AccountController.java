package com.myproject.mystudyproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
		
	@GetMapping({"/detail"})
	public String showDetail() {
		
		
		
		return "/crud/detail";
	}
	
	@GetMapping({"/list"})
	public String showList() {
		
		
		
		return "/crud/list";
	}
	
	
}
