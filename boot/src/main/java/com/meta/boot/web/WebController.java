package com.meta.boot.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
	@RequestMapping("/") 
	public String index() { 
		return "index"; 
	}
	
	@RequestMapping("/welcome") 
	public String welcome() { 
		return "welcome"; 
	}
	
	@RequestMapping("/boot")
	public String boot() { 
		return "boot"; 
	}
}
