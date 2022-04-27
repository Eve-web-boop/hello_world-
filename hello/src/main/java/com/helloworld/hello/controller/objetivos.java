package com.helloworld.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/objetivos")

public class objetivos {
	
	@GetMapping
	
	public ResponseEntity<List<String>> getObjetivos(){
		List<String> list = new ArrayList<>();
		
		list.add("Praticar banco de dados");
		list.add("Criar tabelas");
		list.add("Conhecimentos sobre o DER");
		list.add("Criar DER do PI");
		list.add("Criar der do meu blog");
		list.add("Conhecimentos de métodos e status HTTP");
		list.add("Criar edpoint's");
		list.add("Praticar edpoint's");

		return ResponseEntity.ok().body(list);
	}
	


}
