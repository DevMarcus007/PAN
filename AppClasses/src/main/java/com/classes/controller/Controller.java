package com.classes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.repository.ProdutosRepository;
import com.classes.tabelas.Produtos;

@RestController
@CrossOrigin("*")
public class Controller {

			
		@Autowired
		private ProdutosRepository repository;
		
		@GetMapping("/produtos")
		public List <Produtos> buscarTodos() {
			return repository.findAll();
					
}
}