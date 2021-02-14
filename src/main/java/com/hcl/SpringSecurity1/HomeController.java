package com.hcl.SpringSecurity1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	
	@RequestMapping("/logout")
	public String logoutPage() {
		return "logout";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "userpage";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "adminpage";
	}
	
	
}
