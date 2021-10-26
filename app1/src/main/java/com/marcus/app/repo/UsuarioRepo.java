package com.marcus.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcus.app.controller.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long>{

}
