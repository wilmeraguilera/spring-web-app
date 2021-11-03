package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	public String idex2(){
		System.out.println("Example Error");
		System.out.println("Example Error");
		System.out.println("Example Error");
		System.out.println("Example Error");
		System.out.println("Example Error");
		return "";
	}

}
