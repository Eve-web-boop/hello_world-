package com.helloworld.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bsm")


public class bsm {
	
	@GetMapping
	
	public ResponseEntity<List<String>> getBsm(){
		List<String> list = new ArrayList<>();
		
		list.add("Mentalidade de crescimento");
		list.add("Persistência");
		list.add("Responsabilidade pessoal");
		list.add("Orientação ao futuro");
		list.add("Comunicação");
		list.add("Orientação ao detalhe");
		list.add("Proatividade");
		list.add("Trabalho em equipe");

		return ResponseEntity.ok().body(list);
	}
}
