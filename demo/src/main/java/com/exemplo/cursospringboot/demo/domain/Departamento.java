package com.exemplo.cursospringboot.demo.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")

public class Departamento extends AbstractEntity<Long>{

	
	
	@Column(name = "nome", nullable = false, unique = true, length = 255)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	
	
}