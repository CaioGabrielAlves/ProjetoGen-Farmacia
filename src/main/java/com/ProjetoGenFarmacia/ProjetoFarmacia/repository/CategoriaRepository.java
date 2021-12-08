package com.ProjetoGenFarmacia.ProjetoFarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoGenFarmacia.ProjetoFarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findByDescricaoContainingIgnoreCase(String descricao);

	public Categoria findById(long id);

}
