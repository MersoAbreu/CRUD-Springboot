package com.exemplo.cursospringboot.demo.dao;

import java.util.List;

import com.exemplo.cursospringboot.demo.domain.Funcionario;

public interface FuncionarioDao {

	void save (Funcionario funcionario);
	void delete(Long id);
	void update (Funcionario funcionario);
	Funcionario findById(Long id);
	List<Funcionario>findAll();
	
}
