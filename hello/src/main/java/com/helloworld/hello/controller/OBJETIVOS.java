package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class OBJETIVOS {
	
	@GetMapping
	public String objetivos() {
		return "Lista de Objetivos: \n\n"
				
				+ "Terminar o bootcamp com os conhecimentos fixados. \n"
				+ "Conseguir um emprego. \n"
				+ "Cursar uma graduação em Ciência de Dados ou Engenharia de Software. \n"
				+ "Trocar de moto.";
		
	}

}
