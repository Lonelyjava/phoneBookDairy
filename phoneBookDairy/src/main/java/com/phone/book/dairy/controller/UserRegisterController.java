package com.phone.book.dairy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserRegisterController {
	
	@RequestMapping("/home")
	public String showPage() {
	
		return "user_reguster";
	}

}
