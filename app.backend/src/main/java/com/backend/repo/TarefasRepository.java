package com.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Tarefas;


public interface TarefasRepository extends JpaRepository<Tarefas, Long>{

}
