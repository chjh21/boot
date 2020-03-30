package com.meta.boot.web;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
	@RequestMapping("/welcome") 
	public String welcome() { 
		return "welcome"; 
	}
	
	@RequestMapping("/boot")
	public String boot() { 
		return "boot"; 
	}
}
