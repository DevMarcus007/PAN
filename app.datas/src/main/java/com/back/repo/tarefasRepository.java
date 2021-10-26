package com.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.model.Tarefas;

public interface tarefasRepository extends JpaRepository<Tarefas, Long>{ 
	
	

}
