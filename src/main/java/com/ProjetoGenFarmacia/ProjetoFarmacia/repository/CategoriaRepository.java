package com.ProjetoGenFarmacia.ProjetoFarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, long> {


	public List<Categoria>findByDescricaoContainingIgnoreCaser (String descricao); 
	
	public Categoria findById(long id); 

	
}
}
