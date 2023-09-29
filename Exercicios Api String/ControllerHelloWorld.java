package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class ControllerHelloWorld {

	@GetMapping
	public String helloworld () {
		return "Hello World";

	}
	
	
	@GetMapping("/BMS")
	public void BSM () {
		System.out.println("Mentalidade de Crescimento");
		System.out.println("Orientação ao futuro");	
		System.out.println("COmunicação nao violenta");
		System.out.println("Comunicação nao verbal");
		System.out.println("Entre outros...");
	}
	
	@GetMapping("/objetivos")
	public void objetivos () {
		System.out.println("Ter uma mentalidade de crescimento");
		System.out.println("Ter mais auto cobrança");

	}
	
	
}
