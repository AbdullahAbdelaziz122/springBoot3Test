package com.example.trySpringBoot;

//import org.apache.catalina.servlets.DefaultServlet.SortManager.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
	
	//@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@PostMapping("/post")
	public String post (@RequestBody String message) {
		
		return "Request Accepted and message is: "+message;
	}
	
	
}
