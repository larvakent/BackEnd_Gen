package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSM {
	
	@GetMapping
	public String bsm() {
		return "Lista de BSM's: \n"
				
		       + "Mentalidade de Crescimento \n"
		       + "Persistência \n"
		       + "Trabalho em Equipe \n"
		       + "Responsabilidade Pessoal \n"
		       + "Comuncação \n"
		       + "Orientação ao Futuro \n"
		       + "Orientação ao Detalhe \n"
		       + "Proatividade";
	}
}
