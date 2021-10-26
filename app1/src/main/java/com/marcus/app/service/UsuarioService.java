package com.marcus.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcus.app.repo.UsuarioRepo;
import com.marcus.app.controller.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepo userRepo;
	
	public List<Usuario> getAll() {
		return userRepo.findAll();
		
	}
	
	public Optional<Usuario> getById(long id) {
		return userRepo.findById(id);
	}
}
