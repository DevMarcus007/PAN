package com.classes.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.classes.tabelas.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
