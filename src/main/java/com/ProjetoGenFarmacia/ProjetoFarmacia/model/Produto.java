package com.ProjetoGenFarmacia.ProjetoFarmacia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	@Size(max = 40)
	private String nomeDoMedicamento;

	@NotBlank
	@Size(max = 100)
	private String descricao;

	@NotNull
	private double preco;

	@ManyToOne(cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public String getNomeDoMedicamento() {
		return nomeDoMedicamento;
	}

	public void setNomeDoMedicamento(String nomeDoMedicamento) {
		this.nomeDoMedicamento = nomeDoMedicamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setId(long id) {
		this.id = id;
	}

}